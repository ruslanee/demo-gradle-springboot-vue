<template>
  <div id="doctors">
    Medical Teams list goes here
    <div>
      <ol>
        <li v-for="team in teams" :key="team.id">
          {{ team.name }}
        </li>
      </ol>
    </div>
  </div>
</template>

<script>
import Vue from "vue";

export default Vue.extend({
  data() {
    return {
      teams: []
    };
  },
  created() {
    this.$http.get("/teams/list").then(response => {
      this.teams = response.data;
    });
  }
});
</script>
