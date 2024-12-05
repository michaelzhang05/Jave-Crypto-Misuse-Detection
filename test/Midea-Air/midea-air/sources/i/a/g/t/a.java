package i.a.g.t;

import com.google.android.gms.ads.AdRequest;
import i.a.g.f;
import i.a.g.g;
import i.a.g.h;
import i.a.g.l;
import java.io.IOException;
import java.util.TimerTask;

/* compiled from: DNSTask.java */
/* loaded from: classes2.dex */
public abstract class a extends TimerTask {

    /* renamed from: f, reason: collision with root package name */
    private final l f18423f;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(l lVar) {
        this.f18423f = lVar;
    }

    public f a(f fVar, i.a.g.c cVar, h hVar) throws IOException {
        try {
            fVar.x(cVar, hVar);
            return fVar;
        } catch (IOException unused) {
            int e2 = fVar.e();
            boolean o = fVar.o();
            int E = fVar.E();
            int f2 = fVar.f();
            fVar.v(e2 | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.w(f2);
            this.f18423f.o1(fVar);
            f fVar2 = new f(e2, o, E);
            fVar2.x(cVar, hVar);
            return fVar2;
        }
    }

    public f b(f fVar, h hVar, long j2) throws IOException {
        try {
            fVar.y(hVar, j2);
            return fVar;
        } catch (IOException unused) {
            int e2 = fVar.e();
            boolean o = fVar.o();
            int E = fVar.E();
            int f2 = fVar.f();
            fVar.v(e2 | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.w(f2);
            this.f18423f.o1(fVar);
            f fVar2 = new f(e2, o, E);
            fVar2.y(hVar, j2);
            return fVar2;
        }
    }

    public f c(f fVar, h hVar) throws IOException {
        try {
            fVar.z(hVar);
            return fVar;
        } catch (IOException unused) {
            int e2 = fVar.e();
            boolean o = fVar.o();
            int E = fVar.E();
            int f2 = fVar.f();
            fVar.v(e2 | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.w(f2);
            this.f18423f.o1(fVar);
            f fVar2 = new f(e2, o, E);
            fVar2.z(hVar);
            return fVar2;
        }
    }

    public f d(f fVar, g gVar) throws IOException {
        try {
            fVar.A(gVar);
            return fVar;
        } catch (IOException unused) {
            int e2 = fVar.e();
            boolean o = fVar.o();
            int E = fVar.E();
            int f2 = fVar.f();
            fVar.v(e2 | AdRequest.MAX_CONTENT_URL_LENGTH);
            fVar.w(f2);
            this.f18423f.o1(fVar);
            f fVar2 = new f(e2, o, E);
            fVar2.A(gVar);
            return fVar2;
        }
    }

    public l e() {
        return this.f18423f;
    }

    public abstract String f();

    public String toString() {
        return f();
    }
}
