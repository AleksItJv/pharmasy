<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<@c.page>
    User list
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Role</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td>${user.username}</td>
                <td><#list user.roles as role>${role}<#sep>, </#list></td>
                <td><a href="/user/${user.id}">edit</a> </td>
            </tr>
        </#list>
        </tbody>
    </table>
    <a href="/main">Main menu</a>
    <@l.logout />
</@c.page>