<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>

<script type="text/javascript">	//사진 이미지 불러오기
	var imageURL = "getPicture.do?picture=${member.picture}";
	$('div#pictureView').css({
							'background-image' : 'url('+imageURL+')',
							'background-position' : 'center',
							'background-size' : 'cover',
							'background-repeat' : 'no-repeat'
						});
	$('input').css("border", "none").prop("readonly", ture);
</script>