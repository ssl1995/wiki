<template>
  <a-layout>
    <!-- 使用自定义组件 -->
    <the-header/>
    <!-- 变化的页面，使用路由动态跳转-->
    <router-view/>
    <the-footer/>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent} from 'vue';
// 导入自定义组件
import TheHeader from '@/components/the-header.vue';
import TheFooter from '@/components/the-footer.vue';


export default defineComponent({
  name: 'app',
  components: {
    TheHeader,
    TheFooter,
  },
});
</script>

<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>
