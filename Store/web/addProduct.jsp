<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/24 0024
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品</title>
    <link href="css/addCss.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
    <form enctype="multipart/form-data" method="post" action="/add.do">
        <div class="form-group">
            <label for="pro_name">商品名称</label>
            <input type="text" class="form-control" id="pro_name" placeholder="商品名称" name="proname">
        </div>
        <div class="form-group">
            <label for="pro_price">商品价格</label>
            <input type="number" class="form-control" id="pro_price" placeholder="商品价格" min="1" max="999999" name="proprice">
        </div>
        <div class="form-group">
            <label for="pro_img">商品图片</label>
            <input type="file" id="pro_img" name="proimg">
            <p class="help-block">请选择上传的文件</p>
        </div>
        <div class="form-group">
            <label for="pro_desc">商品详情</label>
            <br>
            <textarea id="pro_desc" placeholder="请输入商品的详细描述" name="prodesc" style="width: 100%"></textarea>
        </div>
        <div class="form-group">
            <label for="pro_stock">商品库存</label>
            <input type="number" class="form-control" id="pro_stock" placeholder="商品库存" min="0" max="999999" name="prostock">
        </div>
        <div class="form-group">
            <label for="pro_date">商品上架日期</label>
            <input type="date" class="form-control" id="pro_date" name="prodate">
         </div>
        <div class="form-group">
            <label for="pro_cate_id">类别id</label>
            <input type="number" class="form-control" id="pro_cate_id" placeholder="商品类别" min="1" max="999" name="procateid">
        </div>
        <div class="form-group">
            <label for="pro_factory">生产厂家</label>
            <input type="text" class="form-control" id="pro_factory" placeholder="生产厂家" name="profactory">
        </div>
        <button type="submit" class="btn btn-default">确认添加</button>
    </form>
</body>
</html>
