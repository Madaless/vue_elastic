<template>
  <div>
    <b-form-input 
      id="filter-input"
      v-model="filter"
      type="search"
      placeholder="Type to search by status"
    ></b-form-input>

    <b-form-group
          label="Initial sort"
          label-for="initial-sort-select"
          label-cols-sm="3"
          label-align-sm="right"
          label-size="sm"
          class="mb-0"
        >
          <b-form-select
            id="initial-sort-select"
            v-model="sortDirection"
            :options="['asc', 'desc', 'last']"
            size="sm"
          ></b-form-select>
        </b-form-group>
  </div>
</template>

<script>
export default {
  setup() {},
};
</script>

<style scoped>

</style>