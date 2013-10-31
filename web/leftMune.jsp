<%--
  Created by IntelliJ IDEA.
  User: 闯儿
  Date: 13-10-30
  Time: 下午5:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/jquery.tree.js"></script>
    <script type="text/javascript">
        $(function(){
            $('#files').tree({
            });
        });
    </script>
</head>
<body>

<style type="text/css">
    *{margin:0;padding:0;list-style-type:none;font-size:12px;}
    a,img{border:0;}
    #files{margin:100px auto;width:400px;}
    .tree,.tree ul,.tree li{list-style:none;margin:0;padding:0;zoom: 1;}
    .tree ul{margin-left:8px;}
    .tree li a{color:#555;padding:.1em 7px .1em 27px;display:block;text-decoration:none;border:1px dashed #fff;}

    .tree li a:hover,.tree li a.tree-parent:hover,.tree li a:focus,.tree li a.tree-parent:focus,.tree li a.tree-item-active{color:#000;border:1px solid#eee;background-color:#fafafa;-moz-border-radius:4px;-webkit-border-radius:4px;border-radius:4px;}
    .tree li a:focus,.tree li a.tree-parent:focus,.tree li a.tree-item-active{border:1px solid #e2f3fb;background-color:#f2fafd;}
    .tree ul.tree-group-collapsed{display:none;}
</style>


<ul id="files">
    <li><a href="javascript:void(0);">咨询</a>
        <ul>

            <li><a href="http://www.17sucai.com/" target="_blank" title="jquery图片切换">资讯管理</a></li>
            <li><a href="http://www.17sucai.com/" target="_blank" title="jquery幻灯片">咨询分类管理</a></li>
            <li><a href="http://www.17sucai.com/" target="_blank" title="jquery图片滚动">咨询审核</a></li>
        </ul>
    </li>
    <li><a href="javascript:void(0);">活动</a>
        <ul>

            <li><a href="http://www.17sucai.com/" target="_blank" title="js图片切换">活动管理</a></li>
            <li><a href="http://www.17sucai.com/" target="_blank" title="js幻灯片">活动审核</a></li>



        </ul>
    </li>

    <li><a href="javascript:void(0);">图说</a>
        <ul>
            <li><a href="http://www.17sucai.com/" target="_blank" title="flash图片特效">图说管理</a></li>
            <li><a href="http://www.17sucai.com/" target="_blank" title="flash导航菜单">图说审核</a></li>
        </ul>
    </li>
    <li><a href="javascript:void(0);">用户</a>

    </li>
    <li><a href="javascript:void(0);">权限</a>

    </li>
</ul>
</body>
</html>