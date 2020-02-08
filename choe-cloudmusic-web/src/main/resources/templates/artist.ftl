<!doctype html>
<html>

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="/vendor/bootstrap/css/bootstrap.min.css">

    <title>Hello, world!</title>

    <style type="text/css">
    	h2 {
            font-size: 24px;
        }
        
        h3 {
            font-size: 12px;
        }
    	
        .container {
            border: 1px solid #d3d3d3;
            border-width: 0 1px;
            width: 982px;
        }

        .g-wrap6 {
            padding: 47px 30px 40px 39px;
        }
        
        .g-wrap7 {
            padding: 20px 40px 40px 30px;
        }
    </style>
</head>

<body>

    <#if artist.alias?? && artist.alias !="">
        <#assign hoverShowName="${artist.name} - ${artist.alias}">
            <#else>
                <#assign hoverShowName="${artist.name}">
    </#if>

    <header>
        <nav class="navbar navbar-expand-lg">
            <a class="navbar-brand" href="https://music.163.com/#">网易云音乐</a>
            <div class="">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link">发现音乐</a></li>
                    <li class="nav-item"><a class="nav-link">我的音乐</a></li>
                    <li class="nav-item"><a class="nav-link">朋友</a></li>
                    <li class="nav-item"><a class="nav-link">商城</a></li>
                    <li class="nav-item"><a class="nav-link">音乐人</a></li>
                </ul>
                <form class="navbar-form">
                    <input class="form-control" type="text" placeholder="音乐/视频/电台/用户">
                </form>
            </div>
        </nav>
    </header>

    <main role="main">
        <div class="container">
            <div class="row">
                <div style="width: 709px">
                	<div class="g-wrap6">
                    <div>
                        <h2 title="${hoverShowName}">${artist.name} 
                        	<#if artist.alias?? && artist.alias !="">
                        	<small>${artist.alias}</small>
                        	</#if>
                        </h2>
                    </div>
					
					<img src="${artist.picUrl}?param=640y300">
	
                    <div>
                        <ul class="nav nav-tabs" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" data-toggle="tab" href="#hotWorks" role="tab">热门作品</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#allAlbums" role="tab"
                                    onclick="queryAlbums(${artist.artistId},1,16)">所有专辑</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#relMvs" role="tab">相关MV</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" data-toggle="tab" href="#artistIntro" role="tab"
                                	onclick="queryIntro(${artist.artistId})">艺人介绍</a>
                            </li>
                        </ul>
                        <div class="tab-content">
                            <div class="tab-pane fade show active" id="hotWorks" role="tabpanel">
                                <p>热门作品</p>
                            </div>
                            <div class="tab-pane fade" id="allAlbums" role="tabpanel">
                            </div>
                            <div class="tab-pane fade" id="relMvs" role="tabpanel">
                                <p>相关MV</p>
                            </div>
                            <div class="tab-pane fade" id="artistIntro" role="tabpanel">
                            </div>
                        </div>
                    </div>
                    </div>
                </div>

                <div style="width: 270px">
                	<div class="g-wrap7">
                    	<h3>热门歌手</h3>
                    	
                    	<ul class="row list-unstyled">
                    		<li class="col-md-4">邓紫棋</li>
                    		<li class="col-md-4">邓紫棋</li>
                    		<li class="col-md-4">邓紫棋</li>
                    		<li class="col-md-4">邓紫棋</li>
                    		<li class="col-md-4">邓紫棋</li>
                    		<li class="col-md-4">邓紫棋</li>
                    	</ul>
                    	
                    	<h3>网易云音乐多端下载</h3>
                    	<ul class="row list-unstyled">
  							<li class="col-md-4"><a href="https://itunes.apple.com/cn/app/id590338362" target="_blank">iPhone</a></li>
  							<li class="col-md-4">Item</li>
  							<li class="col-md-4">Item</li>
						</ul>
						
						<p>同步歌单，随时畅听320k好音乐</p>
                    </div>
                </div>
            </div>
        </div>
    </main>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script type="text/javascript" src="/vendor/jquery.min.js"></script>
    <script type="text/javascript" src="/vendor/popper.min.js"></script>
    <script type="text/javascript" src="/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/vendor/template-web.js"></script>
    <script type="text/javascript" src="/vendor/moment.min.js"></script>

    <script id="tpl-album-tab" type="text/html">
    <ul class="row list-unstyled">
	  {{each albums album}}
      <li class="col-md-3">
		<a href="/album/{{album.albumId}}">
        	<img src="{{album.picUrl}}?param=120y120">
        	<p>{{album.name}}</p>
        	<p><span>{{album.publishTime | formatDate}}</span></p>
		</a>
      </li>
	  {{/each}}
    </ul>
	<nav>
  		<ul class="pagination">
    		<li class="page-item {{if 1 == pageNum}}disabled{{/if}}"><a class="page-link" href="javascript:void(0);" onclick="queryAlbums(${artist.artistId}, {{pageNum - 1}}, 16)">Previous</a></li>
			<% for(var i = 1; i <= pages; i++){ %>
			{{set tmpIndex = i}}
    		<li class="page-item {{if tmpIndex == pageNum}}active{{/if}}"><a class="page-link" href="javascript:void(0);" onclick="queryAlbums(${artist.artistId}, {{tmpIndex}}, 16)">{{tmpIndex}}</a></li>
			<% } %>
    		<li class="page-item {{if pages == pageNum}}disabled{{/if}}"><a class="page-link" href="javascript:void(0);" onclick="queryAlbums(${artist.artistId}, {{pageNum + 1}}, 16)">Next</a></li>
  		</ul>
	</nav>
  </script>
  
  <script id="tpl-intro-tab" type="text/html">
	<div>
    	<h2>${artist.name}简介</h2>
		<p style="text-indent: 2em;white-space: pre-line">${artist.briefDesc}</p>
		{{each intros intro}}
		<h2>{{intro.ti}}</h2>
  		<p style="white-space: pre-line">{{intro.txt}}</p>
		{{/each}}
	</div>
  </script>

    <script>
        function formatDate(timestamp) {
            return moment(timestamp).format('YYYY.MM.DD');
        }

        function queryAlbums(artistId, pageNum, pageSize) {
            $.ajax({
                type: "GET",
                url: "/artist/albums?artistId=" + artistId + "&pageNum=" + pageNum + "&pageSize=" + pageSize,
                success: function (data) {

                    var html = template("tpl-album-tab", { albums: data.list, pages: data.pages, pageNum: data.pageNum });

                    $("#allAlbums").html(html);

                },
                error: function (e) {
                    // TODO
                }
            });
        }
        
        function queryIntro(artistId) {
            $.ajax({
                type: "GET",
                url: "/artist/intro?artistId=" + artistId,
                success: function (data) {
                	var html = template("tpl-intro-tab", {intros: data});

                    $("#artistIntro").html(html);
                },
                error: function (e) {
                    // TODO
                }
            });
        }
    </script>
</body>

</html>