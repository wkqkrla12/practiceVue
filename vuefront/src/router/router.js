import { createRouter, createWebHistory } from 'vue-router'


import Board from "../views/board/BoardList.vue";
import Home from "../views/MainHome.vue";

const router = createRouter({
    history: createWebHistory(),
    routes: [
        { path: '/',
          name: 'home',
          component: Home
        },
        // 여기에 라우트 정의 추가
        // 예: { path: '/board/:id', component: BoardDetail }
        { path: '/board-list/:id',
          name: 'board',
          component: Board,
        },


    ],
});

export default router