package chapter09iterator;

import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2017/12/29 15:26
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private List<MenuItem> list;
    private int position;

    public PancakeHouseMenuIterator(List<MenuItem> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list!=null && position < list.size();
    }

    @Override
    public MenuItem next() {
        return hasNext()?list.get(position++):null;
    }
}
