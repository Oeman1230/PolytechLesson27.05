package workFiles;

import java.util.List;

public class MyHttpParamMapper {
    public static String map(String url, List<HttpParam> httpParamList)
    {
        /*StringBuffer temp = new StringBuffer();
        temp.append(url);

        //temp.append("/"+ httpParamList.forEach(it -> it.getKey() + "/" + it.getValue()); + "/" +httpParamList.get(0).getValue());
        for(httpParamList.)
        return temp.substring(0);*/
        StringBuilder sb = new StringBuilder(url);
        sb.append("?");
        sb.append( httpParamList.get(0).getKey() + "=" + httpParamList.get(0).getValue() );
        httpParamList.stream().skip(1).forEach(it -> sb.append("&" + it.getKey() + "=" + it.getValue()));
        return sb.substring(0);
    }
}
