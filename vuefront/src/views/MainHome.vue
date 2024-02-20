<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';
import Header from '../components/CommonHeader.vue'


const boardList = ref([]);
const newBoard = ref({ name: '', subject: '', hit:'' });

let board = ref();

const fetchBoardList = async () => {
  try {
    const response = await axios.get('/'); // Spring Boot API 엔드포인트 경로
    boardList.value = response.data;
    console.log(response.status)
    console.log(board.value.id)
  }

  catch (error) {
    console.error('Error fetching board list:', error);
  }
};

const submitBoard = async () => {
  try {
    await axios.post('/create', newBoard.value); // Spring Boot API 엔드포인트 경로
    await fetchBoardList(); // 데이터 갱신
    newBoard.value.name = ''; // 수정: title을 name으로 변경
    newBoard.value.subject = ''; // subject도 초기화
  } catch (error) {
    console.error('Error submitting board:', error);
  }
};

onMounted(() => {
  fetchBoardList();
});

</script>

<template>
  <Header/>

  <div>
    <h1>Board List</h1>

    <ul>
      <li v-for="board in boardList" :key="board.id">
        <router-link :to="'/board-list/' + board.id" :replace="true"> {{ board.name }}</router-link>
        {{ board.subject }}
      </li>
    </ul>
    <form @submit.prevent="submitBoard">
      <label>Name:</label>
      <input v-model="newBoard.name" required />
      <br>
      <label>Subject:</label>
      <input v-model="newBoard.subject" required />

      <label>Hit:</label>
      <input v-model="newBoard.hit" required />
      <button type="submit">Add Board</button>

    </form>
  </div>
</template>
