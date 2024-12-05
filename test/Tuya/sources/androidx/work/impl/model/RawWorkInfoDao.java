package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import l6.InterfaceC3358f;

@Dao
/* loaded from: classes3.dex */
public interface RawWorkInfoDao {
    @RawQuery(observedEntities = {WorkSpec.class})
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery(observedEntities = {WorkSpec.class})
    InterfaceC3358f getWorkInfoPojosFlow(SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery(observedEntities = {WorkSpec.class})
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery supportSQLiteQuery);
}
