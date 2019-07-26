
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        	
		<style>
		    body {
		      margin: 0;
		      padding: 0;
		      background-color: #F7F7F7;
		    }
		
		    .tabs {
		      width: 1100px;
		      margin: 30px auto;
		      background-color: #F7F7F7;
		      box-sizing: border-box;
		    }
		
		    .tabs nav {
		      height: 40px;
		      text-align: center;
		      line-height: 40px;
		      overflow: hidden;
		      display: flex;
		    }
		
		    nav a {
		      display: block;
		      width: 100px;
		      border-right: 1px solid #FFF;
		      color: #000;
		      background-color: #E9EBEF;
		      text-decoration: none;
		    }
		
		    nav a:last-child {
		      border-right: none;
		    }
		
		    nav a.active {
		      background-color: #D1E2FA;
		    }
			
		
		    .cont {
		      overflow: hidden;
		      display: none;
		    }
		
		    .cont ol {
		      line-height: 30px;
		    }
  		</style>

    </head>
   <body>
		<div style="text-align: center;">
			<input type="button" value="第一条"/>
			<input type="button" value="上一条"/>
			<input type="button" value="下一条"/>
			<input type="button" value="最后一条"/>
			<input type="button" value="添加"/>
			<input type="button" value="修改"/>
			<input type="button" value="保存"/>
			<input type="button" value="删除"/>
		</div>
		<div style="text-align: center;"><h3>订单采购</h3></div>
		<div style="text-align: center;">
			<samp style="margin: 30px;">供应商：<input type="text" /></samp>
			<samp>单据号码：<input type="text" /></samp>
			<br>
			<samp style="margin-right: 30px;">供应商地址：<input type="text" /></samp>
			<samp>单据日期：<input type="text" /></samp>
		</div>
		<div class="tabs">
	    	<nav>
	     	 <a href="javascript:;" data-cont="local"  class="active">明细</a>
	     	 <a href="javascript:;" data-cont="global" >备注</a>
	    	</nav>
	    	<section class="cont" id="local" style="display:block">
	      		<div style="width: 1090px;height:300px;border: 1px solid #D1E2FA;">
	      			<table>
	      			
	      			<tr style="background-color: #D1E2FA;border: 1px solid #D1E2FA;">
	      				<td style="width: 87px;">序号</td>
	      				<td style="width: 200px;">商品名称</td>
	      				<td style="width: 200px;">数量</td>
	      				<td style="width: 200px;">单价</td>
	      				<td style="width: 200px;">金额</td>
	      				<td style="width: 90px;">赠品</td>
	      				<td style="width: 90px;"><img src="img/addrow.gif" /> </td>
	      			</tr>
	      			<tr style="background-color: #E9EBEF;">
	      				<td style="width: 87px; border: 1px solid #D1E2FA;">1</td>
	      				<td style="width: 200px; border: 1px solid #D1E2FA;">cpu</td>
	      				<td style="width: 200px; border: 1px solid #D1E2FA;">10.00</td>
	      				<td style="width: 200px; border: 1px solid #D1E2FA;">900.00</td>
	      				<td style="width: 200px; border: 1px solid #D1E2FA;">9000.00</td>
	      				<td style="width: 90px; border: 1px solid #D1E2FA;"><input type="checkbox"/></td>
	      				<td style="width: 90px; border: 1px solid #D1E2FA;"><img src="img/delrow.gif" /> </td>
	      			</tr>
	      		</table>
	      		</div>
	    	</section>
	   		<section class="cont" id="global" >
	    		 <div style="width: 1090px;height:300px;border: 1px solid #D1E2FA;">
	      			<div style="width: 1070px;height:200px;border: 1px solid #D1E2FA;margin: 2px;">
	      			<span>到时需要30%的预付款</span>
	      			</div>
	      		</div>
	    	</section>
  		</div>
  		<div style="text-align: center;">
  			<samp style="margin-right: 265px;">采购人员：
  				<select style="width: 120px;">
  					<option value="" selected>牛采购</option>
  					<option value="" >牛谷歌</option>
  				</select>
  			</samp>
  		</div>
  		<div style="text-align: center;">
  			<samp style="margin: 30px;">制单人员：
  				<select style="width: 120px;">
  					<option value="" selected>牛采购</option>
  					<option value="" >牛谷歌</option>
  				</select>
  			</samp>
  			<samp style="margin: 30px;">人员部门：
  				<input type="text" style="width: 120px;"/>
  			</samp>
  		</div>
		<div style="text-align: center;">
  			<samp style="margin: 30px;">审核人员：
  				<select style="width: 120px;">
  					<option value="" selected>牛采购</option>
  					<option value="" >牛谷歌</option>
  				</select>
  			</samp>
  			<samp style="margin: 30px;">审核日期：
  				<input type="text" style="width: 120px;"/>
  			</samp>
  		</div>	
  			
  		<script type="text/javascript" src="js/jquery-1.8.2.js" ></script>
		<script type="text/javascript">
			<!--document.querySelectorAll获取所有的a标签-->
  			var aArr=document.querySelectorAll('a');
		  <!--循环遍历-->
		  for(var i=0;i<aArr.length;i++){
		  <!--给每个获取到的元素添加点击事件-->
		      aArr[i].onclick=function(){
		      <!--获取当前激活的tab选项卡-->
         var active=document.querySelector(".active");
         <!--移除之前的选项卡激活属性-->
         active.classList.remove("active");
         <!--给当前点击的选项卡添加激活属性-->
         this.classList.add("active");
         <!--获取当前的section标签id名字-->
         var name=this.getAttribute("data-cont");
         <!--根据获取到的名字获取当前的内容卡-->
         var section=document.getElementById(name);
         <!--获取所有class为cont的元素，并循环遍历，取消所有内容卡的样式-->
         var cont = document.getElementsByClassName("cont");
         for(var i=0;i<cont.length;i++){
          	cont[i].style.display="none";
        }
	         <!--激活当前内容卡的样式-->
	         section.style.display="block";
	     	}
  		}
		</script>
	</body>
</html>