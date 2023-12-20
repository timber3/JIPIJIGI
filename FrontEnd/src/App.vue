<script setup>
import Navbar from "@/components/common/navbar.vue";
import Footer from "@/components/common/footer.vue";
</script>

<template>
  <div>
    <v-app>
      <Navbar></Navbar>
      <v-content>
        <router-view></router-view>
      </v-content>
      <Footer></Footer>
    </v-app>
  </div>
</template>

<style scoped>
v-content {
  height: auto;
  min-height: 100%;
  padding-bottom: 20px;
}
Footer {
  height: 20px;
  position: relative;
  transform: translateY(-100%);
}
</style>
