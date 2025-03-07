<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
import BasicLayout from '@/layout/BasicLayout.vue'
import {userLoginUserStore} from "@/stores/user.ts";

const loginUserStore = userLoginUserStore()
loginUserStore.fetchLogin()
</script>

<template>
  <div id="app">
    <BasicLayout />
  </div>
</template>

<style scoped>
#app {
}
</style>
