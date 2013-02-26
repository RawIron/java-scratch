package gameCommons.balanceSettings;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

import gameCommons.balanceSettings.Levels;
import gameCommons.balanceSettings.DataLevel;
import gameCommons.balanceSettings.DataItemLevel;


class LevelsTest extends TestCase {
    public LevelsTest() {
        super();
    }

    public final void test_should_need_100_xp() {
        DataLevel mock = mock(DataLevel.class);
        DataItemLevel level = mock.cached.get(12);
        assertEqual(level.level, 12);
    }
}
