<template>
  <div>
    <b-form-input
      id="filter-input"
      v-model="filter"
      type="search"
      placeholder="Type to search by status"
    ></b-form-input>

    <!-- <b-form-select
      id="sort-by-select"
      v-model="sortBy"
      :options="sortOptions"
      :aria-describedby="ariaDescribedby"
      class="w-75">
      <template #first>
        <option value="">-- none --</option>
      </template>
    </b-form-select> -->

  <div>
    <b-form-select  v-model="selected" :options="sortOptions"></b-form-select>
  </div>

    
  </div>
</template>

<script>
export default {
  setup() {},
  data() {
      return {
          sortOptions: ["no","yes"]
      }
  }
};
</script>

<style scoped>
</style>