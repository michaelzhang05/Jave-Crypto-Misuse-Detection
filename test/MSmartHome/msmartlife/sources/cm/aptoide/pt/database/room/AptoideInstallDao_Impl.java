package cm.aptoide.pt.database.room;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.c;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import androidx.room.t.b;
import c.q.a.f;
import h.a.s;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class AptoideInstallDao_Impl implements AptoideInstallDao {
    private final j __db;
    private final c<RoomAptoideInstallApp> __insertionAdapterOfRoomAptoideInstallApp;

    public AptoideInstallDao_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomAptoideInstallApp = new c<RoomAptoideInstallApp>(jVar) { // from class: cm.aptoide.pt.database.room.AptoideInstallDao_Impl.1
            @Override // androidx.room.q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `aptoideinstallapp` (`packageName`) VALUES (?)";
            }

            @Override // androidx.room.c
            public void bind(f fVar, RoomAptoideInstallApp roomAptoideInstallApp) {
                if (roomAptoideInstallApp.getPackageName() == null) {
                    fVar.a0(1);
                } else {
                    fVar.m(1, roomAptoideInstallApp.getPackageName());
                }
            }
        };
    }

    @Override // cm.aptoide.pt.database.room.AptoideInstallDao
    public s<RoomAptoideInstallApp> get(String str) {
        final m f2 = m.f("SELECT * from aptoideinstallapp where packageName = ? LIMIT 1", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        return n.c(new Callable<RoomAptoideInstallApp>() { // from class: cm.aptoide.pt.database.room.AptoideInstallDao_Impl.2
            protected void finalize() {
                f2.z();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomAptoideInstallApp call() throws Exception {
                Cursor b2 = androidx.room.t.c.b(AptoideInstallDao_Impl.this.__db, f2, false, null);
                try {
                    RoomAptoideInstallApp roomAptoideInstallApp = b2.moveToFirst() ? new RoomAptoideInstallApp(b2.getString(b.b(b2, "packageName"))) : null;
                    if (roomAptoideInstallApp != null) {
                        return roomAptoideInstallApp;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + f2.a());
                } finally {
                    b2.close();
                }
            }
        });
    }

    @Override // cm.aptoide.pt.database.room.AptoideInstallDao
    public void insert(RoomAptoideInstallApp roomAptoideInstallApp) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomAptoideInstallApp.insert((c<RoomAptoideInstallApp>) roomAptoideInstallApp);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
