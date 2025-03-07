<script setup lang="ts">
import GlobalHeader from "@/GlobalHeader.vue";
import HomePage from "@/pages/HomePage.vue";

</script>

<template>
  <a-space direction="vertical" :style="{ width: '100%' }" :size="[0, 48]">
    <a-layout style="height: 100vh">
      <a-layout-header style="background: white">
        <GlobalHeader />
      </a-layout-header>
      <a-layout-content>
        <home-page/>
      </a-layout-content>
      <a-layout-footer>
        <a-layout-footer class="footer">
          <a href="https://wendaojidian.github.io/Raymond/git/" target="_blank">
             by Raymond
          </a>
        </a-layout-footer>
      </a-layout-footer>
    </a-layout>
  </a-space>
</template>

<style scoped>


</style>
