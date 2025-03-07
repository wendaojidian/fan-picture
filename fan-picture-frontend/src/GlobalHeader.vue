<template>
  <div id="globalHeader">
    <a-row :wrap="false">
      <a-col flex="200px">
        <RouterLink to="/">
          <div class="title-bar">
            <img class="logo" src="./assets/logo.png" alt="logo" />
            <div class="title">凡图</div>
          </div>
        </RouterLink>
      </a-col>
      <a-col flex="auto">
        <a-menu
          v-model:selectedKeys="current"
          mode="horizontal"
          :items="items"
          @click="doMenuClick"
        />
      </a-col>

      <a-col flex="120px">
        <div class="user-login-status">
          <div v-if="loginUserStore.loginUser.id">
            {{loginUserStore.loginUser.username ?? '无名'}}
          </div>
          <div v-else>
            <a-button type="primary" href="/user/login">登录</a-button>
          </div>
        </div>
      </a-col>
    </a-row>
  </div>
</template>

<script lang="ts" setup>
import { h, ref } from 'vue'
import {
  HomeOutlined,
} from '@ant-design/icons-vue'
import type { MenuProps } from 'ant-design-vue'
import { useRouter } from 'vue-router'
const router = useRouter()

import {health} from "@/api/healthController"
import {userLoginUserStore} from "@/stores/user.ts";

health().then((res) => {
  console.log(res)
})

const loginUserStore = userLoginUserStore()
{{ JSON.stringify(loginUserStore.loginUser) }}

//路由跳转
const doMenuClick = ({ key }: { key: string }) => {
  router.push({
    path: key,
  })
}

// 当前选中菜单
const current = ref<string[]>([]);
router.afterEach((to, from, next) => {
  current.value = [to.path]
})

const items = ref<MenuProps['items']>([
  {
    key: '/',
    icon: () => h(HomeOutlined),
    label: '主页',
    title: '主页',
  },
  {
    key: 'about',
    label: '关于',
    title: '关于',
  },
  {
    key: 'others',
    label: h(
      'a',
      {
        href: 'https://wendaojidian.github.io/Raymond/git/',
        target: '_blank',
      },
      'Raymond',
    ),
    title: 'Raymond',
  },
  {
    key: 'alipay',
    label: h('a', { href: 'https://antdv.com', target: '_blank' }, 'Navigation Four - Link'),
    title: 'Navigation Four - Link',
  },
])
</script>

<style scoped>
.title-bar {
  display: flex;
  align-items: center;
}

.title {
  color: black;
  font-size: 18px;
  margin-left: 16px;
}

.logo {
  height: 48px;
}

.title-bar {
  background-color: white;
}
.user-login-status {
  background-color: white;
}
</style>
