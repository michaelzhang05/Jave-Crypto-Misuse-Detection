package k1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes.dex */
public class d implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7104a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.d f7105b;

    /* renamed from: c, reason: collision with root package name */
    private final f f7106c;

    public d(Context context, l1.d dVar, f fVar) {
        this.f7104a = context;
        this.f7105b = dVar;
        this.f7106c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i6, int i7) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i8 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i6) {
                return i8 >= i7;
            }
        }
        return false;
    }

    @Override // k1.x
    public void a(d1.o oVar, int i6) {
        b(oVar, i6, false);
    }

    @Override // k1.x
    public void b(d1.o oVar, int i6, boolean z5) {
        ComponentName componentName = new ComponentName(this.f7104a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f7104a.getSystemService("jobscheduler");
        int c6 = c(oVar);
        if (!z5 && d(jobScheduler, c6, i6)) {
            h1.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long j6 = this.f7105b.j(oVar);
        JobInfo.Builder c7 = this.f7106c.c(new JobInfo.Builder(c6, componentName), oVar.d(), j6, i6);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i6);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", o1.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        c7.setExtras(persistableBundle);
        h1.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c6), Long.valueOf(this.f7106c.g(oVar.d(), j6, i6)), Long.valueOf(j6), Integer.valueOf(i6));
        jobScheduler.schedule(c7.build());
    }

    int c(d1.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f7104a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(o1.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
