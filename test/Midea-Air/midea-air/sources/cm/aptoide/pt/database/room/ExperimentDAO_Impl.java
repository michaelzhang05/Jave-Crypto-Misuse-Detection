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
public final class ExperimentDAO_Impl implements ExperimentDAO {
    private final j __db;
    private final c<RoomExperiment> __insertionAdapterOfRoomExperiment;

    public ExperimentDAO_Impl(j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomExperiment = new c<RoomExperiment>(jVar) { // from class: cm.aptoide.pt.database.room.ExperimentDAO_Impl.1
            @Override // androidx.room.q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `experiment` (`experimentName`,`requestTime`,`assignment`,`payload`,`partOfExperiment`,`experimentOver`) VALUES (?,?,?,?,?,?)";
            }

            @Override // androidx.room.c
            public void bind(f fVar, RoomExperiment roomExperiment) {
                if (roomExperiment.getExperimentName() == null) {
                    fVar.a0(1);
                } else {
                    fVar.m(1, roomExperiment.getExperimentName());
                }
                fVar.F(2, roomExperiment.getRequestTime());
                if (roomExperiment.getAssignment() == null) {
                    fVar.a0(3);
                } else {
                    fVar.m(3, roomExperiment.getAssignment());
                }
                if (roomExperiment.getPayload() == null) {
                    fVar.a0(4);
                } else {
                    fVar.m(4, roomExperiment.getPayload());
                }
                fVar.F(5, roomExperiment.isPartOfExperiment() ? 1L : 0L);
                fVar.F(6, roomExperiment.isExperimentOver() ? 1L : 0L);
            }
        };
    }

    @Override // cm.aptoide.pt.database.room.ExperimentDAO
    public s<RoomExperiment> get(String str) {
        final m f2 = m.f("SELECT * FROM experiment WHERE experimentName = ?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        return n.c(new Callable<RoomExperiment>() { // from class: cm.aptoide.pt.database.room.ExperimentDAO_Impl.2
            protected void finalize() {
                f2.z();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomExperiment call() throws Exception {
                RoomExperiment roomExperiment = null;
                Cursor b2 = androidx.room.t.c.b(ExperimentDAO_Impl.this.__db, f2, false, null);
                try {
                    int b3 = b.b(b2, "experimentName");
                    int b4 = b.b(b2, "requestTime");
                    int b5 = b.b(b2, "assignment");
                    int b6 = b.b(b2, "payload");
                    int b7 = b.b(b2, "partOfExperiment");
                    int b8 = b.b(b2, "experimentOver");
                    if (b2.moveToFirst()) {
                        roomExperiment = new RoomExperiment(b2.getString(b3), b2.getLong(b4), b2.getString(b5), b2.getString(b6), b2.getInt(b7) != 0, b2.getInt(b8) != 0);
                    }
                    if (roomExperiment != null) {
                        return roomExperiment;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + f2.a());
                } finally {
                    b2.close();
                }
            }
        });
    }

    @Override // cm.aptoide.pt.database.room.ExperimentDAO
    public void save(RoomExperiment roomExperiment) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomExperiment.insert((c<RoomExperiment>) roomExperiment);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
