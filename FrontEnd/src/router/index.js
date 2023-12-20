import { createRouter, createWebHistory } from 'vue-router'
// import MainPage from '@/component/MainPage'
// import mainPage from '@/views/mainPage.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'main',
      // component: mainPage
      component : () => import('@/views/mainPage.vue')
    },
  ]
})

export default router
