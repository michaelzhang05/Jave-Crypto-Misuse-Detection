package B;

import C.InterfaceC1010d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import y.AbstractC4194a;

/* loaded from: classes3.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f651a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1010d f652b;

    /* renamed from: c, reason: collision with root package name */
    private final f f653c;

    public d(Context context, InterfaceC1010d interfaceC1010d, f fVar) {
        this.f651a = context;
        this.f652b = interfaceC1010d;
        this.f653c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i8, int i9) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i10 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i8) {
                if (i10 < i9) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // B.x
    public void a(u.p pVar, int i8, boolean z8) {
        ComponentName componentName = new ComponentName(this.f651a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f651a.getSystemService("jobscheduler");
        int c8 = c(pVar);
        if (!z8 && d(jobScheduler, c8, i8)) {
            AbstractC4194a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", pVar);
            return;
        }
        long r8 = this.f652b.r(pVar);
        JobInfo.Builder c9 = this.f653c.c(new JobInfo.Builder(c8, componentName), pVar.d(), r8, i8);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i8);
        persistableBundle.putString("backendName", pVar.b());
        persistableBundle.putInt("priority", F.a.a(pVar.d()));
        if (pVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(pVar.c(), 0));
        }
        c9.setExtras(persistableBundle);
        AbstractC4194a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", pVar, Integer.valueOf(c8), Long.valueOf(this.f653c.g(pVar.d(), r8, i8)), Long.valueOf(r8), Integer.valueOf(i8));
        jobScheduler.schedule(c9.build());
    }

    @Override // B.x
    public void b(u.p pVar, int i8) {
        a(pVar, i8, false);
    }

    int c(u.p pVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f651a.getPackageName().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(pVar.b().getBytes(Charset.forName(C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(F.a.a(pVar.d())).array());
        if (pVar.c() != null) {
            adler32.update(pVar.c());
        }
        return (int) adler32.getValue();
    }
}
