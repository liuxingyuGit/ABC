$(function() {
	// 数据
	var treeData = [ {
		text : "系统管理",
		iconCls : "icon-menu",
		children : [ {
			text : "商品管理",
			iconCls : "icon-file",
			attributes : {
				url : "jsp/product.jsp"
			}
		}, {
			text : "人员管理",
			iconCls : "icon-user",
			attributes : {
				url : "jsp/user.jsp"
			}
		}, {
			text : "订单管理",
			iconCls : 'icon-user',
			attributes : {
				url : "jsp/order.jsp"
			}
		}, {
			text : "订单明细管理",
			iconCls : 'icon-user',
			attributes : {
				url : "jsp/orderdetail.jsp"
			}
		}, {
			text : "角色管理",
			iconCls : 'icon-user',
			attributes : {
				url : "jsp/roler.jsp"
			}
		}, {
			text : "权限管理",
			iconCls : 'icon-user',
			attributes : {
				url : "jsp/limit.jsp"
			}
		} ]
	} ];
	$("#menu-tree").tree({
		data : treeData,
		lines : true,
		onClick : function(node) {
			if (node.attributes) {
				openTab(node.text, node.attributes.url, node.iconCls);
			}
		}
	});
	// 新增Tab
	function openTab(text, url, iconCls) {
		if ($("#tabs").tabs('exists', text)) {
			$("#tabs").tabs('select', text);
		} else {
			var content = "<iframe frameborder='0' scrolling='auto' style='width:100%;height:100%' src="
					+ url + "></iframe>";
			$("#tabs").tabs('add', {
				title : text,
				closable : true,
				content : content,
				iconCls : iconCls,
			});
		}
	}

	$("#login-box").dialog(
			{
				closed : true,
				/*
				 * buttons : [ { text : "提交", handler : function() { // ajax提交
				 * $.post("user/login", $(".login-form").serialize(),
				 * function(data) { $("#login-box").dialog({ closed : true });
				 * }); } } ]
				 */
			});
	$("#reg-box").dialog('close');
});