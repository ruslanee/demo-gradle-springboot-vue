<template>
  <div id="doctors">
    Doctors-list goes here
    <div>
      <ol>
        <li v-for="doc in doctors" :key="doc.id">
          {{ doc.firstName }} - {{ doc.lastName }}
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
      doctors: []
    };
  },
  created() {
    this.$http.get("/doctors").then(response => {
      this.doctors = response.data;
    });
  }
});
</script>
