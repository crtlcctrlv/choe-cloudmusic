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
        .container {
            border: 1px solid #d3d3d3;
            border-width: 0 1px;
            width: 982px;
        }

        .g-wrap6 {
            padding: 40px;
        }
    </style>
</head>

<body>
	
	<#assign alphabet=["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"] >
	
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
                <div style="width: 180px">
                	<#list categories as category>
                	<div>
                		<h2>${category.name}</h2>
                		<ul class="nav flex-column">
                			<#list category.subList as subCategory>
                        	<li class="nav-item">
                            	<a class="nav-link" href="javascript:void(0);" onclick="queryArtistList('${subCategory.categoryId}','a')">${subCategory.name}</a>
                        	</li>
                        	</#list>
                        </ul>
                	</div>
                	</#list>
                </div>

                <div style="width: 799px">
					<div class="g-wrap6">
						<h3>华语男歌手</h3>
					</div>
					
					<ul class="nav">
						<#list alphabet as letter>
  						<li class="nav-item">
    						<a class="nav-link" href="javascript:void(0);" onclick="queryArtistList(currentCategoryId,'${letter}')">${letter}</a>
  						</li>
  						</#list>
  					</ul>
  					
  					<div id="artistList">
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

	<script id="tpl-artist-list" type="text/html">
    <ul class="row list-unstyled">
	  {{each artists artist index}}
      <li class="col-md-3">
		<a href="/artist/{{artist.artistId}}">
			{{if index < 8}}
        	<img src="{{artist.picUrl}}?param=120y120">
			{{/if}}
        	<p>{{artist.name}}</p>
		</a>
      </li>
	  {{/each}}
    </ul>
	</script>

    <script>
    	var currentCategoryId = '1001';
    
        function queryArtistList(category, initial) {
        	
        	currentCategoryId = category;
        	
            $.ajax({
                type: "GET",
                url: "/artist/discover/list?category=" + category + "&initial=" + initial,
                success: function (data) {

                    var html = template("tpl-artist-list", {artists: data});

                    $("#artistList").html(html);

                },
                error: function (e) {
                    // TODO
                }
            });
        }
    </script>
</body>

</html>