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
            padding: 47px 30px 40px 39px;
        }

        .g-wrap7 {
            padding: 20px 40px 40px 30px;
        }
    </style>
</head>

<body>

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
                            <h3>专辑介绍</h3>
                            <p>${album.description}</p>
                        </div>

                        <div>
                            <h3>包含歌曲列表 <small>${album.size}首歌</small></h3>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col"></th>
                                        <th scope="col">歌曲标题</th>
                                        <th scope="col">时长</th>
                                        <th scope="col">歌手</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<#list songs as song>
                                    <tr>
                                        <th scope="row">${song_index + 1}</th>
                                        <td>${song.name}</td>
                                        <td>${formatSongDuration(song.duration)}</td>
                                        <td>${song.artistName}</td>
                                    </tr>
                                    </#list>
                                </tbody>
                            </table>
                        </div>
                        
                        <div id="albumComments">
                        </div>
                        
                        <div id="commentPage">
                        </div>
                    </div>
                </div>

                <div style="width: 270px">
                    <div class="g-wrap7">
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
    <script type="text/javascript" src="/vendor/paginationjs/pagination.min.js"></script>

	<script id="tpl-comment-area" type="text/html">
	<ul class="list-group">
		{{each data.list comment}}
  		<li class="list-group-item">{{comment.content}}</li>
		{{/each}}
	</ul>
  	</script>
  
    <script>
    function queryIntro(albumId, pageNum) {
        $.ajax({
            type: "GET",
            url: "/album/comments?albumId=" + albumId + "&pageNum=" + pageNum,
            success: function (data) {
            	var html = template("tpl-comment-area", {data: data});

                $("#albumComments").html(html);
            },
            error: function (e) {
                // TODO
            }
        });
    }
    
    $('#commentPage').pagination({
        dataSource: [1, 2, 3, 4, 5, 6, 7],
        callback: function(data, pagination) {
            // template method of yourself
            // var html = template(data);
            // $('#data-container').html(html);
        }
    })
    
    $(document).ready(function(){
    	queryIntro(${album.albumId},1);
    })
    </script>
</body>

</html>