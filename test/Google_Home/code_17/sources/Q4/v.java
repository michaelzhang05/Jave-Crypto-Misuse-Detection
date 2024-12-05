package Q4;

import H4.j;
import O5.I;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageInstallObserver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9232a;

    /* renamed from: b, reason: collision with root package name */
    private final M4.a f9233b;

    /* loaded from: classes5.dex */
    public final class a extends IPackageInstallObserver.Stub {
        public a() {
        }

        @Override // android.content.pm.IPackageInstallObserver
        public void packageInstalled(String packageName, int i8) {
            AbstractC3255y.i(packageName, "packageName");
            if (i8 == 1) {
                M4.a aVar = v.this.f9233b;
                if (aVar != null) {
                    aVar.b(packageName);
                }
                j.a aVar2 = H4.j.f3824g;
                if (aVar2.s() != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("packageName", packageName);
                    ResultReceiver s8 = aVar2.s();
                    if (s8 != null) {
                        s8.send(352, bundle);
                    }
                }
            }
            H4.j.f3824g.e();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9235a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f9237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, S5.d dVar) {
            super(2, dVar);
            this.f9237c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f9237c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f9235a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                v vVar = v.this;
                File file = this.f9237c;
                this.f9235a = 1;
                if (vVar.h(file, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f9238a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f9240c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, S5.d dVar) {
            super(2, dVar);
            this.f9240c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f9240c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            I i8;
            T5.b.e();
            if (this.f9238a == 0) {
                O5.t.b(obj);
                try {
                    if (new J4.a(v.this.f9232a).s()) {
                        v.this.g(this.f9240c);
                        i8 = I.f8278a;
                    } else {
                        M4.a aVar = v.this.f9233b;
                        if (aVar != null) {
                            aVar.f(this.f9240c.getPath());
                            i8 = I.f8278a;
                        } else {
                            i8 = null;
                        }
                    }
                    return i8;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return I.f8278a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public v(Context context, M4.a aVar) {
        AbstractC3255y.i(context, "context");
        this.f9232a = context;
        this.f9233b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(File file) {
        try {
            PackageManager pm = this.f9232a.getPackageManager();
            AbstractC3255y.h(pm, "pm");
            String absolutePath = file.getAbsolutePath();
            AbstractC3255y.h(absolutePath, "apkFile.absolutePath");
            PackageInfo c8 = q.c(pm, absolutePath, 128);
            if (c8 != null) {
                String str = c8.applicationInfo.packageName;
                long m8 = new f().m(c8);
                try {
                    PackageManager packageManager = this.f9232a.getPackageManager();
                    AbstractC3255y.h(packageManager, "context.packageManager");
                    if (new f().m(q.d(packageManager, str, 0)) > m8) {
                        M4.a aVar = this.f9233b;
                        if (aVar != null) {
                            String name = file.getName();
                            AbstractC3255y.h(name, "apkFile.name");
                            aVar.e(name);
                        }
                        j.a aVar2 = H4.j.f3824g;
                        if (aVar2.s() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", str);
                            bundle.putLong("versionCode", m8);
                            ResultReceiver s8 = aVar2.s();
                            if (s8 != null) {
                                s8.send(353, bundle);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                M4.a aVar3 = this.f9233b;
                if (aVar3 != null) {
                    String name2 = file.getName();
                    AbstractC3255y.h(name2, "apkFile.name");
                    aVar3.a(name2);
                }
                j.a aVar4 = H4.j.f3824g;
                if (aVar4.s() != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("packageName", str);
                    bundle2.putLong("versionCode", m8);
                    ResultReceiver s9 = aVar4.s();
                    if (s9 != null) {
                        s9.send(351, bundle2);
                    }
                }
                f fVar = new f();
                String absolutePath2 = file.getAbsolutePath();
                AbstractC3255y.h(absolutePath2, "apkFile.absolutePath");
                String b8 = fVar.b(c8, absolutePath2, pm);
                long m9 = new f().m(c8);
                e eVar = new e();
                String absolutePath3 = file.getAbsolutePath();
                AbstractC3255y.h(absolutePath3, "apkFile.absolutePath");
                long f8 = eVar.f(absolutePath3);
                String str2 = c8.packageName;
                AbstractC3255y.h(str2, "piToInstall.packageName");
                aVar4.v(str2, m9, b8, f8);
                pm.getClass().getMethod("installPackage", (Class[]) Arrays.copyOf(new Class[]{Uri.class, IPackageInstallObserver.class, Integer.TYPE, String.class}, 4)).invoke(pm, Uri.fromFile(file), new a(), 2, null);
                return;
            }
            M4.a aVar5 = this.f9233b;
            if (aVar5 != null) {
                String name3 = file.getName();
                AbstractC3255y.h(name3, "apkFile.name");
                aVar5.d(name3);
            }
            j.a aVar6 = H4.j.f3824g;
            if (aVar6.s() != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("fileName", file.getName());
                ResultReceiver s10 = aVar6.s();
                if (s10 != null) {
                    s10.send(353, bundle3);
                }
            }
        } catch (Error e8) {
            j.a aVar7 = H4.j.f3824g;
            aVar7.e();
            M4.a aVar8 = this.f9233b;
            if (aVar8 != null) {
                String name4 = file.getName();
                AbstractC3255y.h(name4, "apkFile.name");
                aVar8.c(name4, e8.getMessage());
            }
            if (aVar7.s() != null) {
                Bundle bundle4 = new Bundle();
                bundle4.putString("fileName", file.getName());
                ResultReceiver s11 = aVar7.s();
                if (s11 != null) {
                    s11.send(353, bundle4);
                }
            }
        } catch (Exception e9) {
            j.a aVar9 = H4.j.f3824g;
            aVar9.e();
            M4.a aVar10 = this.f9233b;
            if (aVar10 != null) {
                String name5 = file.getName();
                AbstractC3255y.h(name5, "apkFile.name");
                aVar10.c(name5, e9.getMessage());
            }
            if (aVar9.s() != null) {
                Bundle bundle5 = new Bundle();
                bundle5.putString("fileName", file.getName());
                ResultReceiver s12 = aVar9.s();
                if (s12 != null) {
                    s12.send(353, bundle5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(File file, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new c(file, null), dVar);
    }

    public final boolean e() {
        PackageManager pm = this.f9232a.getPackageManager();
        int checkPermission = pm.checkPermission("android.permission.INSTALL_PACKAGES", this.f9232a.getPackageName());
        int checkPermission2 = pm.checkPermission("android.permission.DELETE_PACKAGES", this.f9232a.getPackageName());
        if (checkPermission == 0 && checkPermission2 == 0) {
            return true;
        }
        try {
            AbstractC3255y.h(pm, "pm");
            String packageName = this.f9232a.getPackageName();
            AbstractC3255y.h(packageName, "context.packageName");
            return i(q.d(pm, packageName, 4096));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void f(File file) {
        AbstractC3255y.i(file, "file");
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new b(file, null), 3, null);
    }

    public final boolean i(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        if (packageInfo != null) {
            applicationInfo = packageInfo.applicationInfo;
        } else {
            applicationInfo = null;
        }
        if (applicationInfo != null && (packageInfo.applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
            return true;
        }
        return false;
    }
}
