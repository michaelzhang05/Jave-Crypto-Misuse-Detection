package androidx.room;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class QueryInterceptorOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private final SupportSQLiteOpenHelper.Factory delegate;
    private final RoomDatabase.QueryCallback queryCallback;
    private final Executor queryCallbackExecutor;

    public QueryInterceptorOpenHelperFactory(SupportSQLiteOpenHelper.Factory delegate, Executor queryCallbackExecutor, RoomDatabase.QueryCallback queryCallback) {
        AbstractC3255y.i(delegate, "delegate");
        AbstractC3255y.i(queryCallbackExecutor, "queryCallbackExecutor");
        AbstractC3255y.i(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        AbstractC3255y.i(configuration, "configuration");
        return new QueryInterceptorOpenHelper(this.delegate.create(configuration), this.queryCallbackExecutor, this.queryCallback);
    }
}