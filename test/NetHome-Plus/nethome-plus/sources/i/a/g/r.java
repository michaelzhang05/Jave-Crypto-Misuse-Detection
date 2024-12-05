package i.a.g;

import java.io.IOException;
import java.net.DatagramPacket;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SocketListener.java */
/* loaded from: classes2.dex */
public class r extends Thread {

    /* renamed from: f, reason: collision with root package name */
    static k.b.b f18379f = k.b.c.i(r.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private final l f18380g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(i.a.g.l r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SocketListener("
            r0.append(r1)
            if (r3 == 0) goto L11
            java.lang.String r1 = r3.I0()
            goto L13
        L11:
            java.lang.String r1 = ""
        L13:
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r0 = 1
            r2.setDaemon(r0)
            r2.f18380g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.a.g.r.<init>(i.a.g.l):void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.f18380g.Y0() && !this.f18380g.X0()) {
                datagramPacket.setLength(8972);
                this.f18380g.N0().receive(datagramPacket);
                if (this.f18380g.Y0() || this.f18380g.X0() || this.f18380g.Z0() || this.f18380g.isClosed()) {
                    break;
                }
                try {
                    if (!this.f18380g.H0().E(datagramPacket)) {
                        c cVar = new c(datagramPacket);
                        if (cVar.s()) {
                            if (f18379f.d()) {
                                f18379f.i(getName() + ".run() JmDNS in:" + cVar.C(true));
                            }
                            if (cVar.p()) {
                                int port = datagramPacket.getPort();
                                int i2 = i.a.g.s.a.a;
                                if (port != i2) {
                                    this.f18380g.P0(cVar, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                l lVar = this.f18380g;
                                lVar.P0(cVar, lVar.E0(), i2);
                            } else {
                                this.f18380g.R0(cVar);
                            }
                        } else if (f18379f.b()) {
                            f18379f.c(getName() + ".run() JmDNS in message with error code:" + cVar.C(true));
                        }
                    }
                } catch (IOException e2) {
                    f18379f.f(getName() + ".run() exception ", e2);
                }
            }
        } catch (IOException e3) {
            if (!this.f18380g.Y0() && !this.f18380g.X0() && !this.f18380g.Z0() && !this.f18380g.isClosed()) {
                f18379f.f(getName() + ".run() exception ", e3);
                this.f18380g.d1();
            }
        }
        if (f18379f.d()) {
            f18379f.i(getName() + ".run() exiting.");
        }
    }
}
