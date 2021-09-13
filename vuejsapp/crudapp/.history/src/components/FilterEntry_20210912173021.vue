<template>
  <div>
    <b-form-input
      id="filter-input"
      v-model="filter"
      type="search"
      placeholder="Type to search by status"
    ></b-form-input>

    <b-form-select
      id="sort-by-select"
      v-model="sortBy"
      :options="sortOptions"
      :aria-describedby="ariaDescribedby"
      class="w-75">
      <template #first>
        <option value="">-- none --</option>
      </template>
    </b-form-select>

  <div>
    <b-form-select v-model="selected" :options="options"></b-form-select>
    <b-form-select v-model="selected" :options="options" size="sm" class="mt-3"></b-form-select>
    <div class="mt-3">Selected: <strong>{{ selected }}</strong></div>
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