package org.irmc.industrialrevival.core.data;

import org.apache.ibatis.session.SqlSession;
import org.irmc.industrialrevival.core.guide.GuideSettings;

public class MysqlDataManager implements IDataManager {

    private SqlSession sqlSession;

    public MysqlDataManager() {

    }

    @Override
    public void connect(String url, String username, String password) {

    }

    @Override
    public void close() {

    }

    @Override
    public GuideSettings getGuideSettings(String playerName) {
        return null;
    }

    @Override
    public void saveGuideSettings(String playerName, GuideSettings settings) {

    }
}
