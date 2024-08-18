<template>
  <div class="hello">
    <h1>User List</h1>
    <ul>
      <li v-for="user in users" :key="user">{{ user }}</li>
    </ul>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      users: []
    };
  },
  mounted() {
    axios.get('http://localhost:8080/api/users')
        .then(response => {
          this.users = response.data;
        })
        .catch(error => {
          console.error("Error fetching users:", error);
        });
  }
};
</script>

<style scoped>
h1 {
  font-size: 2em;
}
</style>