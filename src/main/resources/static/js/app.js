function onConnect(id){
    alert("Connected"+id)
    var connection = new EventSource("/streamTransactionsBySociete/" + id);
    connection.onmessage = function(resp){
        console.log(resp);
    }
}