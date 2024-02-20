<script setup>
import {onMounted, ref} from 'vue';
import axios from "axios";

const boardList = ref([]);

// 비동기 호출을 통해 데이터를 가져오는 함수
const fetchData = async () => {
  // 예시: axios를 사용하여 데이터를 가져온다고 가정
  const response = await axios.get('/board-list/list');
  boardList.value = response.data;
};

let board = ref();
console.log(board.value.id + "1")

onMounted(async () => {

  try {
    const response = await fetch(`http://localhost:8080/board-list/${board.value.id}`);
    if (!response.ok) {
      throw new Error("게시판이 존재하지 않습니다.");
    }
    board.value = await response.json();
    console.log(response.status)
    console.log(board.value.id)
  }
  catch (e) {
    console.error(e);

  }
  await fetchData();
});

console.log(board.value.id + "1")


</script>

<template>
  <div>
    <h1>Board List</h1>

    <ul>
      <li v-for="board in boardList" :key="board.id">
        {{ board.name }}
        {{ board.subject }}
      </li>
    </ul>
  </div>
  <router-view></router-view>
</template>
