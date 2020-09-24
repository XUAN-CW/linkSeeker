/**
 * @author XUAN
 * @date 2020/9/24 - 21:34
 * @references
 * @purpose 判断百度云链接是否可用
 */
public class BaiduYunLink implements isUseableLink{

    public boolean judge(String baiduYunLink) {
        boolean available=false;
        //获取百度云链接对应的页面
        GetHTMLByURL getHTMLByURL = new GetHTMLByURL();
        String html = getHTMLByURL.getHTML(baiduYunLink);
        //如果爬取到的 html 页面包含 "请输入提取码" 则说明链接可用
        if(html!=null && html.contains("请输入提取码")){
            available=true;
        }
        return available;
    }
}
