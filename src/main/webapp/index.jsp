<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 引入struts2 的标签库--%>
<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
    <meta charset="UTF-8">
    <title>MywebApp_SSHTest(背包客旅行札记<)</title>
</head>
<body>
    <%--  获取值栈中的user对象的uname值--%>
    用户名:<s:property value="user.uname"></s:property>
    <header id="header">
        <hgroup>
            <h1>背包客旅行札记</h1>
            <h4>旅行是一种休息，而休息是为了走更长远的路</h4>
        </hgroup>
        <nav>
            <ul>
                <li><a href="#">关于背包客</a></li>
                <li class="current-item"><a href="#">国内旅行</a></li>
                <li><a href="#">国内旅游</a></li>
                <li><a href="#">与我联络</a></li>
            </ul>
        </nav>
    </header>
    <article id="travel">
        <section>
            <h2>Hello Word!</h2>
            <p>四季都是旅行的节日。</p>
            <p>不一定要花大钱，做点功课补点习，多点自信，就能享受旅行的美好</p>
        </section>
        <aside>
            <figure>
                <img src="E:/JavaProjectFile/JavaProjectForIdea/MyWebApp/src/java/capital/girl.jpeg" alt="背包出行" width="500" height="300">
            </figure>
        </aside>
    </article>
    <footer>
        我的ssh前端html网页练习
    </footer>
</body>
</html>
