<template>
    <div>
        <h1>EntryList</h1>

        <div class="todos">
        <div
          v-for="entry in entryList"
          class="todo"
          v-bind:key="entry.key"
        >
          {{ entry.title }}
        </div>
    </div>
</template>

<script>

import {mapGetters, mapActions} from 'vuex'

export default ({
    name: 'EntryList',
    methods:{
        ...mapActions(["fetchEntryList"])
    },
    computed: mapGetters([entryList]),
    created(){
        this.fetchEntryList();
    }

})
</script>

<style scoped>

</style>