$(function() {
	$("#province").change(
			function() {
				$("#city option:not(:first)").remove();
				$("#district option:not(:first)").remove();
				var provinceId = $(this).val();
				if (province != "") {
					var url = "citys";
					var args = {
						"provinceId" : provinceId
					};
					$.getJSON(url, args, function(data) {
						if (data.length == 0) {
							alert("当前省下没有信息");
						} else {
							for (var i = 0; i < data.length; i++) {
								var cityId = data[i].id;
								var cityName = data[i].cityName;
								$("#city").append(
										"<option value='" + cityId + "'>"
												+ cityName + "</option>");
							}
						}
					});
				}
			});
	$("#city").change(
			function() {
				$("#district option:not(:first)").remove();
				var cityId = $(this).val();
				if (city != "") {
					var url = "districts";
					var args = {
						"cityId" : cityId
					};
					$.getJSON(url, args, function(data) {
						if (data.length == 0) {
							alert("该市下没有信息");
						} else {
							for (var i = 0; i < data.length; i++) {
								var districtId = data[i].id;
								var districtName = data[i].disName;
								$("#district").append(
										"<option value='" + districtId + "'>"
												+ districtName + "</option>");
							}
						}
					});
				}
			});
});