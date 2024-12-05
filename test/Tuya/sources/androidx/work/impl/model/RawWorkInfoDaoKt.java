package androidx.work.impl.model;

import androidx.sqlite.db.SupportSQLiteQuery;
import i6.I;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3358f;

/* loaded from: classes3.dex */
public final class RawWorkInfoDaoKt {
    public static final InterfaceC3358f getWorkInfoPojosFlow(RawWorkInfoDao rawWorkInfoDao, I dispatcher, SupportSQLiteQuery query) {
        AbstractC3159y.i(rawWorkInfoDao, "<this>");
        AbstractC3159y.i(dispatcher, "dispatcher");
        AbstractC3159y.i(query, "query");
        return WorkSpecDaoKt.dedup(rawWorkInfoDao.getWorkInfoPojosFlow(query), dispatcher);
    }
}
