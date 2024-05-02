package hanshunping.avaj.demo01;

/**
 * @author Zhong.Yl
 * 2024/5/2 17:06
 * java_xuexi
 */
//小老鼠在迷宫中找路
public class MiGong
{
    public static void main(String[] args)
    {
        //先创建地图
        int map[][] = new int[8][7];
        //将最上面和最下面设置为 1
        for(int i = 0; i < 7; i++){
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将最左边和最右边设置为 1
        for(int i = 0; i < 8; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        //输出地图
        System.out.println("===初始地图===");
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        T t = new T();
        t.findWay(map,1,1);
        System.out.println("===查找后的地图===");
        for(int i = 0; i < map.length; i++)
        {
            for(int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
//使用递归帮助小老鼠找路
class T
{
    public boolean findWay(int[][] map,int i,int j)
    {
        if(map[6][5] == 2)//找到
        {
            return true;
        }
        else
        {
            if(map[i][j] == 0)
            {
                //表示可以走通
                map[i][j] = 2;
                //向下找
                if(findWay(map, i+1, j))
                {
                    return true;
                }
                //向右找
                else if(findWay(map,i,j+1))
                {
                    return true;
                }
                //向上找
                else if(findWay(map,i-1,j))
                {
                    return true;
                }
                //向左找
                else if(findWay(map,i,j-1))
                {
                    return true;
                }
                else
                {
                    map[i][j] = 3;
                    return false;
                }
            }
        }
        return false;
    }
}
