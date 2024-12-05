package androidx.work.impl.model;

import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.internal.AbstractC3255y;
import l6.I;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public final class RawWorkInfoDaoKt {
    public static final InterfaceC3706f getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, I dispatcher, SupportSQLiteQuery query) {
        AbstractC3255y.i(rawWorkInfoDao, "<this>");
        AbstractC3255y.i(dispatcher, "dispatcher");
        AbstractC3255y.i(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
