<template>
  <div>
    <h1>Board List</h1>

    <ul>
      <li v-for="board in boardList" :key="board.id">
        {{ board.title }}
      </li>
    </ul>
    <form @submit.prevent="submitBoard">
      <label>Title:</label>
      <input v-model="newBoard.title" required />
      <button type="submit">Add Board</button>
    </form>
  </div>
</template>

<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';

const boardList = ref([]);
const newBoard = ref({ title: '' });

const fetchBoardList = async () => {
  try {
    const response = await axios.get('/api/board/list'); // Spring Boot API 엔드포인트 경로
    boardList.value = response.data;
  } catch (error) {
    console.error('Error fetching board list:', error);
  }
};

const submitBoard = async () => {
  try {
    await axios.post('/api/board/create', newBoard.value); // Spring Boot API 엔드포인트 경로
    fetchBoardList(); // 데이터 갱신
    newBoard.value.title = ''; // 폼 초기화
  } catch (error) {
    console.error('Error submitting board:', error);
  }
};

onMounted(() => {
  fetchBoardList();
});
</script>
