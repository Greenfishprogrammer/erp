<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script type="text/javascript" src="../js/vue.js"></script>
  <script type="text/javascript" src="../js/jquery-1.8.2.js"></script>

  <body>
  <div id="newdiv">
    ssss
  </div>
  </body>
  <script type="text/javascript" >
      var vm = new Vue({
          el: '#newdiv',
          data: {
              message: 'Hello Vue!'
          },
          methods: {
             save :function () {

             },

          }
      })


  </script>
</html>
