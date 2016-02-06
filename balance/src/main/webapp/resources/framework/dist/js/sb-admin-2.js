var menu = [ {
		name : '人员管理',
		url : '/balance/user/showUserList',
		isLeaf : true,
		icon : 'fa-user'
	}, {
		name : '权限管理',
		url : '#',
		isLeaf : false,
		icon : 'fa-book',
		children : [ {
			name : '角色管理',
			url : 'js.html',
			isLeaf : true,
			icon : 'fa-star'
		}, {
			name : '菜单管理',
			url : 'cd.html',
			isLeaf : true,
			icon : 'fa-music'
		} ]
	} ];
$(function() {
	//根据菜单数据构造左侧菜单
	$(menu).each(function(index){ 
		//添加一级菜单
		var _li= $('<li>'); 
		var _a = $('<a>',{'href':this.url});
		var _i = $('<i>',{'class':'fa fa-fw'});
		if(this.icon){
			_i.addClass(this.icon);
		}else{
			_i.addClass("fa-book");
		}
		$(_a).append(_i).append(this.name);
		$(_li).append(_a);
		
		//如有二级，添加二级子菜单
		if(this.isLeaf == false && this.children){
			$(_a).append($('<span>',{'class':'fa arrow'})); 
		}
		if(this.isLeaf == false && this.children){
			var _ul = $('<ul>',{'class':'nav nav-second-level'});
			$(this.children).each(function(ind){
				var _li2 =  $('<li>');
				$(_li2).append( $('<a>',{'href':this.url}).append(this.name));
				$(_ul).append(_li2);
			});
			$(_li).append(_ul);
		}
		$('#side-menu').append(_li);
	});
	$('#side-menu').metisMenu();
	
	
	
	$("#grid-data").bootgrid({
	    ajax: true,
	    post: function ()
	    {
	        return {
	            id: "b0df282a-0d67-40e5-8558-c9e93b7befed"
	        };
	    },
	    url: "/balance/user/showUserList",
	    formatters: {
	        "link": function(column, row)
	        {
	            return "<a href=\"#\">" + column.id + ": " + row.id + "</a>";
	        }
	    }
	});

});

// Loads the correct sidebar on window load,
// collapses the sidebar on window resize.
// Sets the min-height of #page-wrapper to window size
$(function() {
	$(window)
			.bind(
					"load resize",
					function() {
						topOffset = 50;
						width = (this.window.innerWidth > 0) ? this.window.innerWidth
								: this.screen.width;
						if (width < 768) {
							$('div.navbar-collapse').addClass('collapse');
							topOffset = 100; // 2-row-menu
						} else {
							$('div.navbar-collapse').removeClass('collapse');
						}

						height = ((this.window.innerHeight > 0) ? this.window.innerHeight
								: this.screen.height) - 1;
						height = height - topOffset;
						if (height < 1)
							height = 1;
						if (height > topOffset) {
							$("#page-wrapper1").css("min-height",
									(height) + "px");
						}
					});

	var url = window.location;
	var element = $('ul.nav a').filter(function() {
		return this.href == url || url.href.indexOf(this.href) == 0;
	}).addClass('active').parent().parent().addClass('in').parent();
	if (element.is('li')) {
		element.addClass('active');
	}
});
