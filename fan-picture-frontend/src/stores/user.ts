import {defineStore} from 'pinia';
import {ref} from 'vue';

export const userLoginUserStore = defineStore("loginUser", () => {
  const loginUser = ref<any>({
    userName: "未登录",
  });

  async function fetchLogin() {
    //todo
    setTimeout(() => {
      loginUser.value = {
        userName: "小明",
        id: 1
      };
    }, 3000)
  }

  function setLoginUser(newLoginUser: any) {
    loginUser.value = newLoginUser;
  }

  return {loginUser, fetchLogin, setLoginUser};
})
