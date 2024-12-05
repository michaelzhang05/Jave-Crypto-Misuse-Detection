package com.uptodown.core.activities;

import H4.e;
import H4.h;
import H4.i;
import H4.j;
import I4.a1;
import K4.b;
import M4.c;
import M4.f;
import M4.g;
import O5.t;
import P5.AbstractC1378t;
import Q4.s;
import Q4.u;
import Q4.x;
import R5.a;
import S5.d;
import a6.InterfaceC1668n;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.view.ViewGroupKt;
import androidx.documentfile.provider.DocumentFile;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.uptodown.core.activities.FileExplorerActivity;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.J0;

/* loaded from: classes5.dex */
public final class FileExplorerActivity extends a1 {

    /* renamed from: C0, reason: collision with root package name */
    public static final C2694a f30515C0 = new C2694a(null);

    /* renamed from: A, reason: collision with root package name */
    private LinearLayout f30516A;

    /* renamed from: B, reason: collision with root package name */
    private LinearLayout f30518B;

    /* renamed from: B0, reason: collision with root package name */
    private ActivityResultLauncher f30519B0;

    /* renamed from: C, reason: collision with root package name */
    private LinearLayout f30520C;

    /* renamed from: D, reason: collision with root package name */
    private HorizontalScrollView f30521D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f30522E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f30523F;

    /* renamed from: G, reason: collision with root package name */
    private TextView f30524G;

    /* renamed from: H, reason: collision with root package name */
    private SearchView f30525H;

    /* renamed from: I, reason: collision with root package name */
    private ImageView f30526I;

    /* renamed from: J, reason: collision with root package name */
    private RelativeLayout f30527J;

    /* renamed from: K, reason: collision with root package name */
    private RadioButton f30528K;

    /* renamed from: L, reason: collision with root package name */
    private RadioButton f30529L;

    /* renamed from: M, reason: collision with root package name */
    private RadioButton f30530M;

    /* renamed from: N, reason: collision with root package name */
    private AlertDialog f30531N;

    /* renamed from: O, reason: collision with root package name */
    private Toolbar f30532O;

    /* renamed from: P, reason: collision with root package name */
    private TextView f30533P;

    /* renamed from: Q, reason: collision with root package name */
    private b f30534Q;

    /* renamed from: R, reason: collision with root package name */
    private ArrayList f30535R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f30536S;

    /* renamed from: T, reason: collision with root package name */
    private DocumentFile f30537T;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f30538U;

    /* renamed from: V, reason: collision with root package name */
    private ArrayList f30539V;

    /* renamed from: W, reason: collision with root package name */
    private ArrayList f30540W;

    /* renamed from: X, reason: collision with root package name */
    private File f30541X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f30542Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f30543Z;

    /* renamed from: p0, reason: collision with root package name */
    private Object f30544p0;

    /* renamed from: q0, reason: collision with root package name */
    private ArrayList f30545q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f30546r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f30547s0;

    /* renamed from: t0, reason: collision with root package name */
    private TabLayout f30548t0;

    /* renamed from: u0, reason: collision with root package name */
    private TextView f30549u0;

    /* renamed from: v0, reason: collision with root package name */
    private Uri f30550v0;

    /* renamed from: w, reason: collision with root package name */
    private TextView f30551w;

    /* renamed from: w0, reason: collision with root package name */
    private String f30552w0;

    /* renamed from: x, reason: collision with root package name */
    private RecyclerView f30553x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f30555y;

    /* renamed from: z, reason: collision with root package name */
    private RelativeLayout f30557z;

    /* renamed from: x0, reason: collision with root package name */
    private C f30554x0 = new C();

    /* renamed from: y0, reason: collision with root package name */
    private final C2699f f30556y0 = new C2699f();

    /* renamed from: z0, reason: collision with root package name */
    private final G f30558z0 = new G();

    /* renamed from: A0, reason: collision with root package name */
    private final E f30517A0 = new E();

    /* loaded from: classes5.dex */
    public static final class A implements f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30560b;

        A(File file) {
            this.f30560b = file;
        }

        @Override // M4.f
        public void a() {
            i.f(new i(FileExplorerActivity.this), this.f30560b, null, false, 6, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class B implements f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30562b;

        B(DocumentFile documentFile) {
            this.f30562b = documentFile;
        }

        @Override // M4.f
        public void a() {
            i iVar = new i(FileExplorerActivity.this);
            Uri uri = this.f30562b.getUri();
            AbstractC3255y.h(uri, "documentFile.uri");
            i.e(iVar, uri, null, false, false, 14, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class C implements g {
        C() {
        }

        @Override // M4.g
        public void a(Object item, int i8) {
            AbstractC3255y.i(item, "item");
            b bVar = FileExplorerActivity.this.f30534Q;
            if (bVar != null && bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f30534Q;
                AbstractC3255y.f(bVar2);
                bVar2.h(i8);
                FileExplorerActivity.this.a5();
                return;
            }
            if (item instanceof File) {
                File file = (File) item;
                if (file.isDirectory()) {
                    FileExplorerActivity.this.f30541X = file;
                    FileExplorerActivity.this.f30537T = null;
                    FileExplorerActivity.p4(FileExplorerActivity.this, false, 1, null);
                    return;
                }
                Q4.f fVar = new Q4.f();
                String name = file.getName();
                AbstractC3255y.h(name, "item.name");
                if (fVar.o(name)) {
                    FileExplorerActivity.this.m4(file);
                    return;
                }
                String name2 = file.getName();
                AbstractC3255y.h(name2, "item.name");
                if (n.r(name2, ".zip", false, 2, null)) {
                    FileExplorerActivity.this.e4(item);
                    return;
                } else {
                    FileExplorerActivity.this.N4(file);
                    return;
                }
            }
            if (item instanceof DocumentFile) {
                DocumentFile documentFile = (DocumentFile) item;
                if (documentFile.isDirectory()) {
                    FileExplorerActivity.this.f30537T = documentFile;
                    FileExplorerActivity.this.f30541X = null;
                    FileExplorerActivity.p4(FileExplorerActivity.this, false, 1, null);
                    return;
                }
                if (documentFile.getName() != null) {
                    Q4.f fVar2 = new Q4.f();
                    String name3 = documentFile.getName();
                    AbstractC3255y.f(name3);
                    if (fVar2.o(name3)) {
                        FileExplorerActivity.this.l4(documentFile);
                        return;
                    }
                }
                if (documentFile.getName() != null) {
                    String name4 = documentFile.getName();
                    AbstractC3255y.f(name4);
                    if (n.r(name4, ".zip", false, 2, null)) {
                        FileExplorerActivity.this.e4(item);
                        return;
                    }
                }
                FileExplorerActivity.this.M4(documentFile);
            }
        }

        @Override // M4.g
        public void b(Object item, int i8) {
            AbstractC3255y.i(item, "item");
            b bVar = FileExplorerActivity.this.f30534Q;
            AbstractC3255y.f(bVar);
            if (bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f30534Q;
                AbstractC3255y.f(bVar2);
                bVar2.h(i8);
                FileExplorerActivity.this.a5();
                return;
            }
            FileExplorerActivity.this.H3(item, i8);
        }
    }

    /* loaded from: classes5.dex */
    public static final class D implements M4.i {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30565b;

        D(String str) {
            this.f30565b = str;
        }

        @Override // M4.i
        public void a(ArrayList items) {
            AbstractC3255y.i(items, "items");
            FileExplorerActivity.this.f30536S = items;
            FileExplorerActivity.this.f30535R = items;
            FileExplorerActivity.this.f30540W = null;
            FileExplorerActivity.this.f30539V = null;
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            SearchView searchView = fileExplorerActivity.f30525H;
            AbstractC3255y.f(searchView);
            fileExplorerActivity.u3(searchView.getQuery().toString(), this.f30565b);
        }

        @Override // M4.i
        public void b(ArrayList items) {
            AbstractC3255y.i(items, "items");
            FileExplorerActivity.this.f30540W = items;
            FileExplorerActivity.this.f30539V = items;
            FileExplorerActivity.this.f30536S = null;
            FileExplorerActivity.this.f30535R = null;
            if (FileExplorerActivity.this.f30541X != null) {
                File file = FileExplorerActivity.this.f30541X;
                AbstractC3255y.f(file);
                if (!file.canRead()) {
                    ArrayList arrayList = FileExplorerActivity.this.f30540W;
                    AbstractC3255y.f(arrayList);
                    if (arrayList.isEmpty()) {
                        File externalStorageDirectory = Environment.getExternalStorageDirectory();
                        File file2 = FileExplorerActivity.this.f30541X;
                        AbstractC3255y.f(file2);
                        if (file2.getAbsolutePath().equals(externalStorageDirectory.getAbsolutePath() + "/Android/data")) {
                            File file3 = new File(FileExplorerActivity.this.f30541X, FileExplorerActivity.this.getPackageName());
                            if (file3.exists() && file3.canRead()) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(new File(FileExplorerActivity.this.f30541X, FileExplorerActivity.this.getPackageName()));
                                FileExplorerActivity.this.f30540W = arrayList2;
                                FileExplorerActivity.this.f30539V = arrayList2;
                            }
                        }
                    }
                }
            }
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            SearchView searchView = fileExplorerActivity.f30525H;
            AbstractC3255y.f(searchView);
            fileExplorerActivity.u3(searchView.getQuery().toString(), this.f30565b);
        }
    }

    /* loaded from: classes5.dex */
    public static final class E extends OnBackPressedCallback {
        E() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            b bVar = FileExplorerActivity.this.f30534Q;
            if (bVar != null && bVar.c()) {
                b bVar2 = FileExplorerActivity.this.f30534Q;
                AbstractC3255y.f(bVar2);
                bVar2.i(false);
                FileExplorerActivity.this.k4();
                return;
            }
            if (FileExplorerActivity.this.f30537T != null) {
                DocumentFile documentFile = FileExplorerActivity.this.f30537T;
                AbstractC3255y.f(documentFile);
                String name = documentFile.getName();
                DocumentFile documentFile2 = FileExplorerActivity.this.f30537T;
                AbstractC3255y.f(documentFile2);
                DocumentFile parentFile = documentFile2.getParentFile();
                if (parentFile != null) {
                    FileExplorerActivity.this.f30537T = parentFile;
                    FileExplorerActivity.this.f30541X = null;
                    FileExplorerActivity.this.S4();
                    FileExplorerActivity.this.n4(name);
                    SearchView searchView = FileExplorerActivity.this.f30525H;
                    if (searchView != null) {
                        FileExplorerActivity.this.y3(searchView);
                        return;
                    }
                    return;
                }
                FileExplorerActivity.this.finish();
                return;
            }
            if (FileExplorerActivity.this.f30541X != null && !AbstractC3255y.d(FileExplorerActivity.this.f30541X, Environment.getExternalStorageDirectory())) {
                File file = FileExplorerActivity.this.f30541X;
                AbstractC3255y.f(file);
                String name2 = file.getName();
                File file2 = FileExplorerActivity.this.f30541X;
                AbstractC3255y.f(file2);
                File parentFile2 = file2.getParentFile();
                if (parentFile2 != null) {
                    FileExplorerActivity.this.f30541X = parentFile2;
                    FileExplorerActivity.this.f30537T = null;
                    FileExplorerActivity.this.S4();
                    FileExplorerActivity.this.n4(name2);
                    SearchView searchView2 = FileExplorerActivity.this.f30525H;
                    if (searchView2 != null) {
                        FileExplorerActivity.this.y3(searchView2);
                        return;
                    }
                    return;
                }
                FileExplorerActivity.this.finish();
                return;
            }
            FileExplorerActivity.this.finish();
        }
    }

    /* loaded from: classes5.dex */
    public static final class F implements TabLayout.OnTabSelectedListener {
        F() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null || tab.getId() != 0) {
                FileExplorerActivity.this.f30543Z = true;
                ArrayList arrayList = FileExplorerActivity.this.f30538U;
                AbstractC3255y.f(arrayList);
                if (arrayList.size() > 0) {
                    FileExplorerActivity.this.T4();
                    FileExplorerActivity.this.w3();
                    return;
                }
                return;
            }
            FileExplorerActivity.this.f30543Z = false;
            RecyclerView recyclerView = FileExplorerActivity.this.f30553x;
            if (recyclerView == null) {
                AbstractC3255y.y("rvFiles");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            LinearLayout linearLayout = FileExplorerActivity.this.f30516A;
            if (linearLayout == null) {
                AbstractC3255y.y("llPermissionExplanation");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView2 = FileExplorerActivity.this.f30553x;
            if (recyclerView2 == null) {
                AbstractC3255y.y("rvFiles");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(0);
            FileExplorerActivity.this.T4();
            FileExplorerActivity.this.Z4();
            FileExplorerActivity.p4(FileExplorerActivity.this, false, 1, null);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* loaded from: classes5.dex */
    public static final class G implements SearchView.OnQueryTextListener {
        G() {
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String newText) {
            AbstractC3255y.i(newText, "newText");
            FileExplorerActivity.this.u3(newText, null);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String query) {
            AbstractC3255y.i(query, "query");
            FileExplorerActivity.this.u3(query, null);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class H extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30569a;

        H(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new H(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30569a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30569a = 1;
                if (fileExplorerActivity.P4(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((H) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30571a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30572b;

        /* renamed from: d, reason: collision with root package name */
        int f30574d;

        I(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30572b = obj;
            this.f30574d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.P4(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class J extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30575a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f30576b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30578a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30579b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30579b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30579b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30578a == 0) {
                    t.b(obj);
                    this.f30579b.k5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30581b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30581b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new b(this.f30581b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30580a == 0) {
                    t.b(obj);
                    this.f30581b.i5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30582a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30583b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30583b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new c(this.f30583b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30582a == 0) {
                    t.b(obj);
                    this.f30583b.j5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        J(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            J j8 = new J(dVar);
            j8.f30576b = obj;
            return j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l6.U b8;
            l6.U b9;
            l6.U b10;
            Object e8 = T5.b.e();
            int i8 = this.f30575a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2 && i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                l6.M m8 = (l6.M) this.f30576b;
                RadioButton radioButton = FileExplorerActivity.this.f30528K;
                AbstractC3255y.f(radioButton);
                if (radioButton.isChecked()) {
                    b10 = AbstractC3364k.b(m8, null, null, new c(FileExplorerActivity.this, null), 3, null);
                    this.f30575a = 1;
                    if (b10.D(this) == e8) {
                        return e8;
                    }
                } else {
                    RadioButton radioButton2 = FileExplorerActivity.this.f30529L;
                    AbstractC3255y.f(radioButton2);
                    if (radioButton2.isChecked()) {
                        b9 = AbstractC3364k.b(m8, null, null, new a(FileExplorerActivity.this, null), 3, null);
                        this.f30575a = 2;
                        if (b9.D(this) == e8) {
                            return e8;
                        }
                    } else {
                        RadioButton radioButton3 = FileExplorerActivity.this.f30530M;
                        AbstractC3255y.f(radioButton3);
                        if (radioButton3.isChecked()) {
                            b8 = AbstractC3364k.b(m8, null, null, new b(FileExplorerActivity.this, null), 3, null);
                            this.f30575a = 3;
                            if (b8.D(this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((J) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class K extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30584a;

        K(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new K(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30584a == 0) {
                t.b(obj);
                FileExplorerActivity.this.Y4();
                RelativeLayout relativeLayout = FileExplorerActivity.this.f30555y;
                if (relativeLayout == null) {
                    AbstractC3255y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(8);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((K) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class L implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj).lastModified()), Long.valueOf(((DocumentFile) obj2).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class M implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class N implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class O implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class P implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj2).lastModified()), Long.valueOf(((DocumentFile) obj).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class Q implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class R implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj2).lastModified()), Long.valueOf(((File) obj).lastModified()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class S implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class T implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str;
            String name = ((DocumentFile) obj).getName();
            String str2 = null;
            if (name != null) {
                AbstractC3255y.h(name, "name");
                str = name.toUpperCase(Locale.ROOT);
                AbstractC3255y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            String name2 = ((DocumentFile) obj2).getName();
            if (name2 != null) {
                AbstractC3255y.h(name2, "name");
                str2 = name2.toUpperCase(Locale.ROOT);
                AbstractC3255y.h(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            return a.a(str, str2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class U implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class V implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String name = ((File) obj).getName();
            AbstractC3255y.h(name, "it.name");
            Locale locale = Locale.ROOT;
            String upperCase = name.toUpperCase(locale);
            AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String name2 = ((File) obj2).getName();
            AbstractC3255y.h(name2, "it.name");
            String upperCase2 = name2.toUpperCase(locale);
            AbstractC3255y.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return a.a(upperCase, upperCase2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class W implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class X implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String str;
            String name = ((DocumentFile) obj2).getName();
            String str2 = null;
            if (name != null) {
                AbstractC3255y.h(name, "name");
                str = name.toUpperCase(Locale.ROOT);
                AbstractC3255y.h(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                str = null;
            }
            String name2 = ((DocumentFile) obj).getName();
            if (name2 != null) {
                AbstractC3255y.h(name2, "name");
                str2 = name2.toUpperCase(Locale.ROOT);
                AbstractC3255y.h(str2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            }
            return a.a(str, str2);
        }
    }

    /* loaded from: classes5.dex */
    public static final class Y implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* loaded from: classes5.dex */
    public static final class Z implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            String name = ((File) obj2).getName();
            AbstractC3255y.h(name, "it.name");
            Locale locale = Locale.ROOT;
            String upperCase = name.toUpperCase(locale);
            AbstractC3255y.h(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String name2 = ((File) obj).getName();
            AbstractC3255y.h(name2, "it.name");
            String upperCase2 = name2.toUpperCase(locale);
            AbstractC3255y.h(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return a.a(upperCase, upperCase2);
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$a, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2694a {
        private C2694a() {
        }

        public /* synthetic */ C2694a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class a0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2695b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30586a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30588c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30589d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30590a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30591b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f30592c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f30593d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.uptodown.core.activities.FileExplorerActivity$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0703a extends l implements InterfaceC1668n {

                /* renamed from: a, reason: collision with root package name */
                int f30594a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FileExplorerActivity f30595b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f30596c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0703a(FileExplorerActivity fileExplorerActivity, String str, d dVar) {
                    super(2, dVar);
                    this.f30595b = fileExplorerActivity;
                    this.f30596c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new C0703a(this.f30595b, this.f30596c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    T5.b.e();
                    if (this.f30594a == 0) {
                        t.b(obj);
                        RelativeLayout relativeLayout = this.f30595b.f30555y;
                        if (relativeLayout == null) {
                            AbstractC3255y.y("rlLoading");
                            relativeLayout = null;
                        }
                        relativeLayout.setVisibility(8);
                        this.f30595b.f5(this.f30596c);
                        this.f30595b.v3();
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // a6.InterfaceC1668n
                public final Object invoke(l6.M m8, d dVar) {
                    return ((C0703a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, String str, String str2, d dVar) {
                super(2, dVar);
                this.f30591b = fileExplorerActivity;
                this.f30592c = str;
                this.f30593d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30591b, this.f30592c, this.f30593d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f30590a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            t.b(obj);
                            return O5.I.f8278a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    this.f30591b.X4(this.f30592c);
                    FileExplorerActivity fileExplorerActivity = this.f30591b;
                    this.f30590a = 1;
                    if (fileExplorerActivity.P4(this) == e8) {
                        return e8;
                    }
                }
                J0 c8 = C3347b0.c();
                C0703a c0703a = new C0703a(this.f30591b, this.f30593d, null);
                this.f30590a = 2;
                if (AbstractC3360i.g(c8, c0703a, this) == e8) {
                    return e8;
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2695b(String str, String str2, d dVar) {
            super(2, dVar);
            this.f30588c = str;
            this.f30589d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2695b(this.f30588c, this.f30589d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30586a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                l6.I b8 = C3347b0.b();
                a aVar = new a(FileExplorerActivity.this, this.f30588c, this.f30589d, null);
                this.f30586a = 1;
                if (AbstractC3360i.g(b8, aVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2695b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj).length()), Long.valueOf(((DocumentFile) obj2).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$c, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2696c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f30598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f30600d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30601e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30602a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30603b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30603b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30603b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30602a == 0) {
                    t.b(obj);
                    this.f30603b.m5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2696c(ArrayList arrayList, DocumentFile documentFile, c cVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30598b = arrayList;
            this.f30599c = documentFile;
            this.f30600d = cVar;
            this.f30601e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2696c(this.f30598b, this.f30599c, this.f30600d, this.f30601e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30597a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                ArrayList arrayList = this.f30598b;
                DocumentFile documentFile = this.f30599c;
                c cVar = this.f30600d;
                Context applicationContext = this.f30601e.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                this.f30597a = 1;
                if (xVar.h(arrayList, documentFile, cVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3347b0.c();
            a aVar = new a(this.f30601e, null);
            this.f30597a = 2;
            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2696c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj).isFile()), Boolean.valueOf(((DocumentFile) obj2).isFile()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$d, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2697d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f30605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f30606c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f30607d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30608e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30609a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30610b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30610b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30610b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30609a == 0) {
                    t.b(obj);
                    this.f30610b.m5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2697d(ArrayList arrayList, File file, c cVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30605b = arrayList;
            this.f30606c = file;
            this.f30607d = cVar;
            this.f30608e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2697d(this.f30605b, this.f30606c, this.f30607d, this.f30608e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30604a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                ArrayList arrayList = this.f30605b;
                File file = this.f30606c;
                c cVar = this.f30607d;
                this.f30604a = 1;
                if (xVar.i(arrayList, file, cVar, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3347b0.c();
            a aVar = new a(this.f30608e, null);
            this.f30604a = 2;
            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2697d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj).length()), Long.valueOf(((File) obj2).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$e, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2698e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30611a;

        C2698e(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2698e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30611a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30611a = 1;
                if (fileExplorerActivity.C3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2698e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj).isFile()), Boolean.valueOf(((File) obj2).isFile()));
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$f, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2699f implements M4.d {
        C2699f() {
        }

        @Override // M4.d
        public void a(DocumentFile docFile) {
            AbstractC3255y.i(docFile, "docFile");
        }

        @Override // M4.d
        public void b(int i8) {
            ((ProgressBar) FileExplorerActivity.this.findViewById(e.f3591G)).setProgress(i8);
        }

        @Override // M4.d
        public void c(File file) {
            AbstractC3255y.i(file, "file");
        }

        @Override // M4.d
        public void d(DocumentFile docFile) {
            AbstractC3255y.i(docFile, "docFile");
        }

        @Override // M4.d
        public void e(File file) {
            AbstractC3255y.i(file, "file");
        }

        @Override // M4.d
        public void f(Object file, int i8) {
            String string;
            AbstractC3255y.i(file, "file");
            RelativeLayout relativeLayout = FileExplorerActivity.this.f30557z;
            if (relativeLayout == null) {
                AbstractC3255y.y("rlLoadingAction");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(0);
            View findViewById = FileExplorerActivity.this.findViewById(e.f3716v1);
            FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
            TextView textView = (TextView) findViewById;
            textView.setTypeface(j.f3824g.u());
            if (file instanceof File) {
                string = fileExplorerActivity.getString(h.f3792h, ((File) file).getName());
            } else if (file instanceof DocumentFile) {
                string = fileExplorerActivity.getString(h.f3792h, ((DocumentFile) file).getName());
            } else {
                string = fileExplorerActivity.getString(h.f3792h);
            }
            textView.setText(string);
        }

        @Override // M4.d
        public void g() {
        }

        @Override // M4.d
        public void h(Object file) {
            AbstractC3255y.i(file, "file");
        }

        @Override // M4.d
        public void i() {
            FileExplorerActivity.this.f30545q0 = null;
            FileExplorerActivity.this.k4();
            RelativeLayout relativeLayout = FileExplorerActivity.this.f30557z;
            if (relativeLayout == null) {
                AbstractC3255y.y("rlLoadingAction");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(8);
            FileExplorerActivity.p4(FileExplorerActivity.this, false, 1, null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((DocumentFile) obj2).length()), Long.valueOf(((DocumentFile) obj).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$g, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2700g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30614a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30615b;

        /* renamed from: d, reason: collision with root package name */
        int f30617d;

        C2700g(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30615b = obj;
            this.f30617d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.C3(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class g0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((DocumentFile) obj2).isDirectory()), Boolean.valueOf(((DocumentFile) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$h, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2701h extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30618a;

        C2701h(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2701h(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30618a == 0) {
                t.b(obj);
                if (FileExplorerActivity.this.f30534Q != null) {
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    b bVar = fileExplorerActivity.f30534Q;
                    AbstractC3255y.f(bVar);
                    fileExplorerActivity.f30545q0 = bVar.b();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2701h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class h0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Long.valueOf(((File) obj2).length()), Long.valueOf(((File) obj).length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$i, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2702i extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30620a;

        C2702i(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2702i(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem menuItem;
            MenuItem menuItem2;
            MenuItem menuItem3;
            MenuItem menuItem4;
            MenuItem menuItem5;
            Menu menu;
            Menu menu2;
            Menu menu3;
            Menu menu4;
            Menu menu5;
            Menu menu6;
            T5.b.e();
            if (this.f30620a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f30534Q;
                AbstractC3255y.f(bVar);
                bVar.i(false);
                if (FileExplorerActivity.this.f30545q0 != null) {
                    AbstractC3255y.f(FileExplorerActivity.this.f30545q0);
                    if (!r5.isEmpty()) {
                        Toolbar toolbar = FileExplorerActivity.this.f30532O;
                        MenuItem menuItem6 = null;
                        if (toolbar != null && (menu6 = toolbar.getMenu()) != null) {
                            menuItem = menu6.findItem(e.f3666f);
                        } else {
                            menuItem = null;
                        }
                        if (menuItem != null) {
                            menuItem.setVisible(true);
                        }
                        Toolbar toolbar2 = FileExplorerActivity.this.f30532O;
                        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null) {
                            menuItem2 = menu5.findItem(e.f3657c);
                        } else {
                            menuItem2 = null;
                        }
                        if (menuItem2 != null) {
                            menuItem2.setVisible(true);
                        }
                        Toolbar toolbar3 = FileExplorerActivity.this.f30532O;
                        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null) {
                            menuItem3 = menu4.findItem(e.f3654b);
                        } else {
                            menuItem3 = null;
                        }
                        if (menuItem3 != null) {
                            menuItem3.setVisible(false);
                        }
                        Toolbar toolbar4 = FileExplorerActivity.this.f30532O;
                        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null) {
                            menuItem4 = menu3.findItem(e.f3651a);
                        } else {
                            menuItem4 = null;
                        }
                        if (menuItem4 != null) {
                            menuItem4.setVisible(false);
                        }
                        Toolbar toolbar5 = FileExplorerActivity.this.f30532O;
                        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null) {
                            menuItem5 = menu2.findItem(e.f3660d);
                        } else {
                            menuItem5 = null;
                        }
                        if (menuItem5 != null) {
                            menuItem5.setVisible(false);
                        }
                        Toolbar toolbar6 = FileExplorerActivity.this.f30532O;
                        if (toolbar6 != null && (menu = toolbar6.getMenu()) != null) {
                            menuItem6 = menu.findItem(e.f3663e);
                        }
                        if (menuItem6 != null) {
                            menuItem6.setVisible(false);
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2702i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i0 implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a.a(Boolean.valueOf(((File) obj2).isDirectory()), Boolean.valueOf(((File) obj).isDirectory()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2703j extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f30622a;

        /* renamed from: b, reason: collision with root package name */
        int f30623b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O f30625d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f30626e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30627a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity) {
                super(0);
                this.f30627a = fileExplorerActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5581invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5581invoke() {
                AlertDialog alertDialog = this.f30627a.f30531N;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30628a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(FileExplorerActivity fileExplorerActivity) {
                super(0);
                this.f30628a = fileExplorerActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5582invoke();
                return O5.I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5582invoke() {
                AlertDialog alertDialog = this.f30628a.f30531N;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$j$c */
        /* loaded from: classes5.dex */
        public static final class c extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30629a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30630b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30630b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new c(this.f30630b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30629a == 0) {
                    t.b(obj);
                    this.f30630b.o4(false);
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2703j(kotlin.jvm.internal.O o8, String str, d dVar) {
            super(2, dVar);
            this.f30625d = o8;
            this.f30626e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2703j(this.f30625d, this.f30626e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.O o8;
            kotlin.jvm.internal.O o9;
            Object e8 = T5.b.e();
            int i8 = this.f30623b;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            t.b(obj);
                            return O5.I.f8278a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o8 = (kotlin.jvm.internal.O) this.f30622a;
                    t.b(obj);
                    o8.f34158a = ((Boolean) obj).booleanValue();
                } else {
                    o9 = (kotlin.jvm.internal.O) this.f30622a;
                    t.b(obj);
                    o9.f34158a = ((Boolean) obj).booleanValue();
                }
            } else {
                t.b(obj);
                if (FileExplorerActivity.this.f30541X != null) {
                    o9 = this.f30625d;
                    Q4.e eVar = new Q4.e();
                    File file = FileExplorerActivity.this.f30541X;
                    AbstractC3255y.f(file);
                    String str = this.f30626e;
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    a aVar = new a(fileExplorerActivity);
                    this.f30622a = o9;
                    this.f30623b = 1;
                    obj = eVar.d(file, str, fileExplorerActivity, aVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                    o9.f34158a = ((Boolean) obj).booleanValue();
                } else if (FileExplorerActivity.this.f30537T != null) {
                    o8 = this.f30625d;
                    Q4.e eVar2 = new Q4.e();
                    DocumentFile documentFile = FileExplorerActivity.this.f30537T;
                    AbstractC3255y.f(documentFile);
                    String str2 = this.f30626e;
                    FileExplorerActivity fileExplorerActivity2 = FileExplorerActivity.this;
                    b bVar = new b(fileExplorerActivity2);
                    this.f30622a = o8;
                    this.f30623b = 2;
                    obj = eVar2.d(documentFile, str2, fileExplorerActivity2, bVar, this);
                    if (obj == e8) {
                        return e8;
                    }
                    o8.f34158a = ((Boolean) obj).booleanValue();
                }
            }
            if (this.f30625d.f34158a) {
                J0 c8 = C3347b0.c();
                c cVar = new c(FileExplorerActivity.this, null);
                this.f30622a = null;
                this.f30623b = 3;
                if (AbstractC3360i.g(c8, cVar, this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2703j) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$k, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2704k extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30631a;

        C2704k(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2704k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30631a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30631a = 1;
                if (fileExplorerActivity.R3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2704k) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$l, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2705l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30633a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30634b;

        /* renamed from: d, reason: collision with root package name */
        int f30636d;

        C2705l(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30634b = obj;
            this.f30636d |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.R3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$m, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2706m extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30637a;

        C2706m(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2706m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30637a == 0) {
                t.b(obj);
                if (FileExplorerActivity.this.f30534Q != null) {
                    FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                    b bVar = fileExplorerActivity.f30534Q;
                    AbstractC3255y.f(bVar);
                    fileExplorerActivity.f30545q0 = bVar.b();
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2706m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$n, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2707n extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30639a;

        C2707n(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2707n(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MenuItem menuItem;
            MenuItem menuItem2;
            MenuItem menuItem3;
            MenuItem menuItem4;
            MenuItem menuItem5;
            Menu menu;
            Menu menu2;
            Menu menu3;
            Menu menu4;
            Menu menu5;
            Menu menu6;
            T5.b.e();
            if (this.f30639a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f30534Q;
                AbstractC3255y.f(bVar);
                bVar.i(false);
                if (FileExplorerActivity.this.f30545q0 != null) {
                    AbstractC3255y.f(FileExplorerActivity.this.f30545q0);
                    if (!r5.isEmpty()) {
                        Toolbar toolbar = FileExplorerActivity.this.f30532O;
                        MenuItem menuItem6 = null;
                        if (toolbar != null && (menu6 = toolbar.getMenu()) != null) {
                            menuItem = menu6.findItem(e.f3666f);
                        } else {
                            menuItem = null;
                        }
                        if (menuItem != null) {
                            menuItem.setVisible(true);
                        }
                        Toolbar toolbar2 = FileExplorerActivity.this.f30532O;
                        if (toolbar2 != null && (menu5 = toolbar2.getMenu()) != null) {
                            menuItem2 = menu5.findItem(e.f3657c);
                        } else {
                            menuItem2 = null;
                        }
                        if (menuItem2 != null) {
                            menuItem2.setVisible(true);
                        }
                        Toolbar toolbar3 = FileExplorerActivity.this.f30532O;
                        if (toolbar3 != null && (menu4 = toolbar3.getMenu()) != null) {
                            menuItem3 = menu4.findItem(e.f3654b);
                        } else {
                            menuItem3 = null;
                        }
                        if (menuItem3 != null) {
                            menuItem3.setVisible(false);
                        }
                        Toolbar toolbar4 = FileExplorerActivity.this.f30532O;
                        if (toolbar4 != null && (menu3 = toolbar4.getMenu()) != null) {
                            menuItem4 = menu3.findItem(e.f3651a);
                        } else {
                            menuItem4 = null;
                        }
                        if (menuItem4 != null) {
                            menuItem4.setVisible(false);
                        }
                        Toolbar toolbar5 = FileExplorerActivity.this.f30532O;
                        if (toolbar5 != null && (menu2 = toolbar5.getMenu()) != null) {
                            menuItem5 = menu2.findItem(e.f3660d);
                        } else {
                            menuItem5 = null;
                        }
                        if (menuItem5 != null) {
                            menuItem5.setVisible(false);
                        }
                        Toolbar toolbar6 = FileExplorerActivity.this.f30532O;
                        if (toolbar6 != null && (menu = toolbar6.getMenu()) != null) {
                            menuItem6 = menu.findItem(e.f3663e);
                        }
                        if (menuItem6 != null) {
                            menuItem6.setVisible(false);
                        }
                    }
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2707n) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$o, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2708o extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30641a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30642b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30643c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M4.e f30644d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30645e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$o$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30646a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30647b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30647b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30647b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30646a == 0) {
                    t.b(obj);
                    this.f30647b.m5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2708o(File file, String str, M4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30642b = file;
            this.f30643c = str;
            this.f30644d = eVar;
            this.f30645e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2708o(this.f30642b, this.f30643c, this.f30644d, this.f30645e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30641a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                File file = this.f30642b;
                String str = this.f30643c;
                M4.e eVar = this.f30644d;
                this.f30641a = 1;
                if (xVar.m(file, str, eVar, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3347b0.c();
            a aVar = new a(this.f30645e, null);
            this.f30641a = 2;
            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2708o) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$p, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2709p extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30648a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f30649b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f30650c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M4.e f30651d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30652e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$p$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30653a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30654b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30654b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30654b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30653a == 0) {
                    t.b(obj);
                    this.f30654b.m5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2709p(File file, Uri uri, M4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30649b = file;
            this.f30650c = uri;
            this.f30651d = eVar;
            this.f30652e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2709p(this.f30649b, this.f30650c, this.f30651d, this.f30652e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30648a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                File file = this.f30649b;
                Uri uri = this.f30650c;
                M4.e eVar = this.f30651d;
                Context applicationContext = this.f30652e.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                this.f30648a = 1;
                if (xVar.l(file, uri, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3347b0.c();
            a aVar = new a(this.f30652e, null);
            this.f30648a = 2;
            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2709p) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$q, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2710q extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30657c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M4.e f30658d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30659e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$q$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30660a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30661b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30661b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30661b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30660a == 0) {
                    t.b(obj);
                    this.f30661b.m5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2710q(DocumentFile documentFile, String str, M4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30656b = documentFile;
            this.f30657c = str;
            this.f30658d = eVar;
            this.f30659e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2710q(this.f30656b, this.f30657c, this.f30658d, this.f30659e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30655a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                DocumentFile documentFile = this.f30656b;
                String str = this.f30657c;
                M4.e eVar = this.f30658d;
                Context applicationContext = this.f30659e.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                this.f30655a = 1;
                if (xVar.k(documentFile, str, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3347b0.c();
            a aVar = new a(this.f30659e, null);
            this.f30655a = 2;
            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2710q) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$r, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2711r extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30662a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ DocumentFile f30663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f30664c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ M4.e f30665d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30666e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$r$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30667a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30668b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, d dVar) {
                super(2, dVar);
                this.f30668b = fileExplorerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30668b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30667a == 0) {
                    t.b(obj);
                    this.f30668b.m5();
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2711r(DocumentFile documentFile, Uri uri, M4.e eVar, FileExplorerActivity fileExplorerActivity, d dVar) {
            super(2, dVar);
            this.f30663b = documentFile;
            this.f30664c = uri;
            this.f30665d = eVar;
            this.f30666e = fileExplorerActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2711r(this.f30663b, this.f30664c, this.f30665d, this.f30666e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30662a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                x xVar = new x();
                DocumentFile documentFile = this.f30663b;
                Uri uri = this.f30664c;
                M4.e eVar = this.f30665d;
                Context applicationContext = this.f30666e.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                this.f30662a = 1;
                if (xVar.j(documentFile, uri, eVar, applicationContext, this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3347b0.c();
            a aVar = new a(this.f30666e, null);
            this.f30662a = 2;
            if (AbstractC3360i.g(c8, aVar, this) == e8) {
                return e8;
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2711r) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$s, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2712s extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30669a;

        C2712s(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2712s(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30669a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                this.f30669a = 1;
                if (fileExplorerActivity.X3(this) == e8) {
                    return e8;
                }
            }
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2712s) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$t, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2713t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30671a;

        /* renamed from: b, reason: collision with root package name */
        Object f30672b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30673c;

        /* renamed from: e, reason: collision with root package name */
        int f30675e;

        C2713t(d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30673c = obj;
            this.f30675e |= Integer.MIN_VALUE;
            return FileExplorerActivity.this.X3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$u, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2714u extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30676a;

        C2714u(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2714u(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30676a == 0) {
                t.b(obj);
                RelativeLayout relativeLayout = FileExplorerActivity.this.f30555y;
                if (relativeLayout == null) {
                    AbstractC3255y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(0);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2714u) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$v, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2715v extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f30678a;

        /* renamed from: b, reason: collision with root package name */
        int f30679b;

        /* renamed from: c, reason: collision with root package name */
        int f30680c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f30682e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.FileExplorerActivity$v$a */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30683a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ FileExplorerActivity f30684b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f30685c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(FileExplorerActivity fileExplorerActivity, int i8, d dVar) {
                super(2, dVar);
                this.f30684b = fileExplorerActivity;
                this.f30685c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f30684b, this.f30685c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30683a == 0) {
                    t.b(obj);
                    b bVar = this.f30684b.f30534Q;
                    AbstractC3255y.f(bVar);
                    bVar.notifyItemRemoved(this.f30685c);
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2715v(kotlin.jvm.internal.Q q8, d dVar) {
            super(2, dVar);
            this.f30682e = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2715v(this.f30682e, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006d -> B:5:0x0088). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0085 -> B:5:0x0088). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r9.f30680c
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 != r3) goto L17
                int r1 = r9.f30679b
                java.lang.Object r4 = r9.f30678a
                java.util.Iterator r4 = (java.util.Iterator) r4
                O5.t.b(r10)
                goto L88
            L17:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1f:
                O5.t.b(r10)
                com.uptodown.core.activities.FileExplorerActivity r10 = com.uptodown.core.activities.FileExplorerActivity.this
                K4.b r10 = com.uptodown.core.activities.FileExplorerActivity.A2(r10)
                if (r10 == 0) goto L8a
                com.uptodown.core.activities.FileExplorerActivity r10 = com.uptodown.core.activities.FileExplorerActivity.this
                K4.b r10 = com.uptodown.core.activities.FileExplorerActivity.A2(r10)
                kotlin.jvm.internal.AbstractC3255y.f(r10)
                java.util.ArrayList r10 = r10.b()
                kotlin.jvm.internal.Q r1 = r9.f30682e
                int r4 = r10.size()
                r1.f34160a = r4
                java.util.Iterator r10 = r10.iterator()
                r4 = r10
                r10 = 0
            L45:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L8a
                int r1 = r10 + 1
                java.lang.Object r5 = r4.next()
                boolean r6 = r5 instanceof java.io.File
                if (r6 == 0) goto L61
                Q4.g r6 = new Q4.g
                r6.<init>()
                java.io.File r5 = (java.io.File) r5
                boolean r5 = r6.a(r5)
                goto L6d
            L61:
                boolean r6 = r5 instanceof androidx.documentfile.provider.DocumentFile
                if (r6 == 0) goto L6c
                androidx.documentfile.provider.DocumentFile r5 = (androidx.documentfile.provider.DocumentFile) r5
                boolean r5 = r5.delete()
                goto L6d
            L6c:
                r5 = 0
            L6d:
                if (r5 == 0) goto L88
                l6.J0 r5 = l6.C3347b0.c()
                com.uptodown.core.activities.FileExplorerActivity$v$a r6 = new com.uptodown.core.activities.FileExplorerActivity$v$a
                com.uptodown.core.activities.FileExplorerActivity r7 = com.uptodown.core.activities.FileExplorerActivity.this
                r8 = 0
                r6.<init>(r7, r10, r8)
                r9.f30678a = r4
                r9.f30679b = r1
                r9.f30680c = r3
                java.lang.Object r10 = l6.AbstractC3360i.g(r5, r6, r9)
                if (r10 != r0) goto L88
                return r0
            L88:
                r10 = r1
                goto L45
            L8a:
                O5.I r10 = O5.I.f8278a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.C2715v.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2715v) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$w, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2716w extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30686a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.Q f30688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2716w(kotlin.jvm.internal.Q q8, d dVar) {
            super(2, dVar);
            this.f30688c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2716w(this.f30688c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30686a == 0) {
                t.b(obj);
                b bVar = FileExplorerActivity.this.f30534Q;
                AbstractC3255y.f(bVar);
                bVar.i(false);
                RelativeLayout relativeLayout = FileExplorerActivity.this.f30555y;
                if (relativeLayout == null) {
                    AbstractC3255y.y("rlLoading");
                    relativeLayout = null;
                }
                relativeLayout.setVisibility(8);
                FileExplorerActivity fileExplorerActivity = FileExplorerActivity.this;
                Toast.makeText(fileExplorerActivity, fileExplorerActivity.getString(h.f3814s, String.valueOf(this.f30688c.f34160a)), 1).show();
                FileExplorerActivity.this.k4();
                FileExplorerActivity.this.o4(false);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2716w) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$x, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2717x implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ProgressBar f30689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f30690b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f30691c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30692d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f30693e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f30694f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f30695g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TextView f30696h;

        C2717x(ProgressBar progressBar, TextView textView, EditText editText, FileExplorerActivity fileExplorerActivity, TextView textView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4) {
            this.f30689a = progressBar;
            this.f30690b = textView;
            this.f30691c = editText;
            this.f30692d = fileExplorerActivity;
            this.f30693e = textView2;
            this.f30694f = textView3;
            this.f30695g = relativeLayout;
            this.f30696h = textView4;
        }

        @Override // M4.c
        public void a(String fileName) {
            AbstractC3255y.i(fileName, "fileName");
            this.f30694f.setText(fileName);
            this.f30695g.setVisibility(8);
            this.f30693e.setVisibility(8);
            this.f30696h.setText(this.f30692d.getString(h.f3784d));
        }

        @Override // M4.c
        public void b(String filesCount) {
            AbstractC3255y.i(filesCount, "filesCount");
            this.f30691c.setFocusable(false);
            this.f30691c.setFocusableInTouchMode(false);
            this.f30691c.clearFocus();
            this.f30689a.setVisibility(0);
            this.f30690b.setVisibility(0);
            this.f30690b.setText(this.f30692d.getString(h.f3822z, filesCount));
            this.f30693e.setVisibility(8);
        }

        @Override // M4.c
        public void c(int i8, String filesCount) {
            AbstractC3255y.i(filesCount, "filesCount");
            this.f30689a.setProgress(i8);
            this.f30690b.setText(filesCount);
        }

        @Override // M4.c
        public void onError(String str) {
            this.f30694f.setText(str);
            this.f30689a.setVisibility(0);
            this.f30693e.setVisibility(8);
            this.f30696h.setText(this.f30692d.getString(h.f3784d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$y, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2718y extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30697a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f30699c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2718y(EditText editText, d dVar) {
            super(2, dVar);
            this.f30699c = editText;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C2718y(this.f30699c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30697a == 0) {
                t.b(obj);
                FileExplorerActivity.this.G3(this.f30699c.getText().toString());
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, d dVar) {
            return ((C2718y) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.uptodown.core.activities.FileExplorerActivity$z, reason: case insensitive filesystem */
    /* loaded from: classes5.dex */
    public static final class C2719z implements M4.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f30700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FileExplorerActivity f30701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f30702c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ProgressBar f30703d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f30704e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TextView f30705f;

        C2719z(TextView textView, FileExplorerActivity fileExplorerActivity, View view, ProgressBar progressBar, TextView textView2, TextView textView3) {
            this.f30700a = textView;
            this.f30701b = fileExplorerActivity;
            this.f30702c = view;
            this.f30703d = progressBar;
            this.f30704e = textView2;
            this.f30705f = textView3;
        }

        @Override // M4.e
        public void a() {
            this.f30700a.setText(this.f30701b.getString(h.f3804n));
            this.f30703d.setIndeterminate(false);
            this.f30703d.setProgress(0);
            this.f30705f.setText(this.f30701b.getString(h.f3784d));
        }

        @Override // M4.e
        public void b(int i8) {
            this.f30700a.setText(this.f30701b.getString(h.f3800l, String.valueOf(i8)));
            this.f30703d.setIndeterminate(false);
            this.f30703d.setProgress(100);
            this.f30705f.setText(this.f30701b.getString(h.f3784d));
        }

        @Override // M4.e
        public void c() {
            this.f30700a.setText(this.f30701b.getString(h.f3802m));
            ((RadioGroup) this.f30702c.findViewById(e.f3624R)).setVisibility(8);
            TextView textView = this.f30701b.f30523F;
            if (textView == null) {
                AbstractC3255y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(8);
            this.f30703d.setVisibility(0);
            this.f30703d.setIndeterminate(true);
            this.f30704e.setVisibility(8);
        }

        @Override // M4.e
        public void d(long j8) {
            this.f30700a.setText(this.f30701b.getString(h.f3802m) + ' ' + new Q4.g().c(j8));
        }
    }

    public FileExplorerActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: I4.w
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FileExplorerActivity.R4(FileExplorerActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f30519B0 = registerForActivityResult;
    }

    private final InterfaceC3390x0 A3(ArrayList arrayList, File file, c cVar) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2697d(arrayList, file, cVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.f30542Y = !this$0.f30542Y;
            RadioButton radioButton = this$0.f30530M;
            AbstractC3255y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: I4.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.B4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f30528K;
            AbstractC3255y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: I4.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.C4(view);
                }
            });
            RadioButton radioButton3 = this$0.f30529L;
            AbstractC3255y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: I4.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.D4(view);
                }
            });
        }
    }

    private final void B3() {
        AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2698e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f30542Y = !this$0.f30542Y;
        this$0.O4();
        this$0.b5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C3(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.C2700g
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$g r0 = (com.uptodown.core.activities.FileExplorerActivity.C2700g) r0
            int r1 = r0.f30617d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30617d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$g r0 = new com.uptodown.core.activities.FileExplorerActivity$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30615b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30617d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f30614a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            com.uptodown.core.activities.FileExplorerActivity$h r2 = new com.uptodown.core.activities.FileExplorerActivity$h
            r2.<init>(r5)
            r0.f30614a = r6
            r0.f30617d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            com.uptodown.core.activities.FileExplorerActivity$i r4 = new com.uptodown.core.activities.FileExplorerActivity$i
            r4.<init>(r5)
            r0.f30614a = r5
            r0.f30617d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.C3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C4(View view) {
    }

    private final void D3() {
        AlertDialog alertDialog = this.f30531N;
        if (alertDialog != null) {
            AbstractC3255y.f(alertDialog);
            alertDialog.dismiss();
        }
        Integer num = null;
        View inflate = getLayoutInflater().inflate(H4.f.f3734f, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(e.f3640W0);
        j.a aVar = j.f3824g;
        textView.setTypeface(aVar.u());
        Context context = textView.getContext();
        int i8 = h.f3806o;
        b bVar = this.f30534Q;
        if (bVar != null) {
            num = Integer.valueOf(bVar.a());
        }
        textView.setText(context.getString(i8, String.valueOf(num)));
        TextView textView2 = (TextView) inflate.findViewById(e.f3688m0);
        textView2.setText(getString(h.f3797j0));
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: I4.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.E3(FileExplorerActivity.this, view);
            }
        });
        TextView textView3 = (TextView) inflate.findViewById(e.f3727z0);
        textView3.setText(getString(h.f3795i0));
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.F3(FileExplorerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f30531N = create;
        AbstractC3255y.f(create);
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog2 = this.f30531N;
        AbstractC3255y.f(alertDialog2);
        alertDialog2.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.W3();
        AlertDialog alertDialog = this$0.f30531N;
        AbstractC3255y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E4(FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        new J4.a(this$0).H(z8);
        SearchView searchView = this$0.f30525H;
        AbstractC3255y.f(searchView);
        this$0.u3(searchView.getQuery().toString(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30531N;
        AbstractC3255y.f(alertDialog);
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(String str) {
        AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2703j(new kotlin.jvm.internal.O(), str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if (j6.n.r(r15, ".zip", false, 2, null) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a6, code lost:
    
        r15 = (android.widget.TextView) r7.findViewById(H4.e.f3583D0);
        r15.setVisibility(0);
        r15.setTypeface(r10.u());
        r15.setOnClickListener(new I4.X(r16, r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d0, code lost:
    
        if (j6.n.r(r4, ".zip", false, 2, null) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:
    
        r4 = (android.widget.TextView) r7.findViewById(H4.e.f3598I0);
        r4.setVisibility(0);
        r4.setTypeface(r10.u());
        r4.setOnClickListener(new I4.Y(r16, r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e4, code lost:
    
        if (j6.n.r(r4, ".zip", false, 2, null) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a4, code lost:
    
        if (j6.n.r(r15, ".zip", false, 2, null) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H3(final java.lang.Object r17, final int r18) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.H3(java.lang.Object, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (obj instanceof File) {
            this$0.N4((File) obj);
        } else if (obj instanceof DocumentFile) {
            this$0.M4((DocumentFile) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean I4(FileExplorerActivity this$0, MenuItem item) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(item, "item");
        int itemId = item.getItemId();
        if (itemId == e.f3669g) {
            b bVar = this$0.f30534Q;
            if (bVar != null) {
                AbstractC3255y.f(bVar);
                if (bVar.c()) {
                    this$0.k4();
                } else {
                    this$0.h5();
                }
                b bVar2 = this$0.f30534Q;
                AbstractC3255y.f(bVar2);
                AbstractC3255y.f(this$0.f30534Q);
                bVar2.i(!r2.c());
            }
        } else if (itemId == e.f3657c) {
            this$0.b4();
        } else if (itemId == e.f3663e) {
            this$0.D3();
        } else if (itemId == e.f3651a) {
            this$0.Y3(null);
        } else if (itemId == e.f3654b) {
            this$0.B3();
        } else if (itemId == e.f3660d) {
            this$0.Q3();
        } else if (itemId == e.f3666f) {
            this$0.Q4();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(FileExplorerActivity this$0, Object obj, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.Y3(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        SearchView searchView = this$0.f30525H;
        if (searchView != null) {
            searchView.setIconified(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(FileExplorerActivity this$0, Object obj, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.e4(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        RelativeLayout relativeLayout = this$0.f30527J;
        AbstractC3255y.f(relativeLayout);
        if (relativeLayout.getVisibility() == 0) {
            view.animate().rotation(0.0f).start();
            RelativeLayout relativeLayout2 = this$0.f30527J;
            AbstractC3255y.f(relativeLayout2);
            relativeLayout2.setVisibility(8);
            return;
        }
        view.animate().rotation(180.0f).start();
        RelativeLayout relativeLayout3 = this$0.f30527J;
        AbstractC3255y.f(relativeLayout3);
        relativeLayout3.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (obj instanceof File) {
            File file = (File) obj;
            if (file.exists()) {
                this$0.g5(file.getAbsolutePath());
                return;
            }
            return;
        }
        if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.exists()) {
                this$0.g5(documentFile.getUri().getPath());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f30542Y = !this$0.f30542Y;
        this$0.O4();
        this$0.c5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(FileExplorerActivity this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f30546r0 = false;
        b bVar = this$0.f30534Q;
        AbstractC3255y.f(bVar);
        bVar.h(i8);
        this$0.h5();
        this$0.B3();
        AlertDialog alertDialog = this$0.f30531N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M4(DocumentFile documentFile) {
        Uri uri = documentFile.getUri();
        AbstractC3255y.h(uri, "documentFile.uri");
        l5(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(FileExplorerActivity this$0, int i8, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f30546r0 = true;
        b bVar = this$0.f30534Q;
        AbstractC3255y.f(bVar);
        bVar.h(i8);
        this$0.h5();
        this$0.Q3();
        AlertDialog alertDialog = this$0.f30531N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N4(File file) {
        Uri uri = FileProvider.getUriForFile(this, getApplicationContext().getPackageName() + ".provider", file);
        AbstractC3255y.h(uri, "uri");
        l5(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(FileExplorerActivity this$0, Object obj, int i8, View view) {
        String name;
        AbstractC3255y.i(this$0, "this$0");
        this$0.f30546r0 = false;
        if (obj instanceof File) {
            File file = (File) obj;
            if (new Q4.g().a(file)) {
                b bVar = this$0.f30534Q;
                if (bVar != null) {
                    bVar.f(i8);
                }
                name = file.getName();
            }
            name = "";
        } else {
            if (obj instanceof DocumentFile) {
                DocumentFile documentFile = (DocumentFile) obj;
                if (documentFile.delete()) {
                    b bVar2 = this$0.f30534Q;
                    if (bVar2 != null) {
                        bVar2.f(i8);
                    }
                    name = documentFile.getName();
                }
            }
            name = "";
        }
        if (name != null && name.length() != 0) {
            Toast.makeText(this$0, this$0.getString(h.f3812r, name), 1).show();
        }
        AlertDialog alertDialog = this$0.f30531N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void O4() {
        AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new H(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(Object obj, FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        O4.h l8 = j.f3824g.l();
        AbstractC3255y.f(l8);
        if (l8.e() != null) {
            if (obj instanceof File) {
                File file = (File) obj;
                if (!file.isDirectory()) {
                    Application application = this$0.getApplication();
                    AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                    ((j) application).R(file);
                }
            } else if (obj instanceof DocumentFile) {
                Application application2 = this$0.getApplication();
                AbstractC3255y.g(application2, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                ((j) application2).Q((DocumentFile) obj);
            }
        } else {
            this$0.f30544p0 = obj;
            this$0.R0();
        }
        AlertDialog alertDialog = this$0.f30531N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P4(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.I
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$I r0 = (com.uptodown.core.activities.FileExplorerActivity.I) r0
            int r1 = r0.f30574d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30574d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$I r0 = new com.uptodown.core.activities.FileExplorerActivity$I
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30572b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30574d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f30571a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            com.uptodown.core.activities.FileExplorerActivity$J r2 = new com.uptodown.core.activities.FileExplorerActivity$J
            r2.<init>(r5)
            r0.f30571a = r6
            r0.f30574d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            com.uptodown.core.activities.FileExplorerActivity$K r4 = new com.uptodown.core.activities.FileExplorerActivity$K
            r4.<init>(r5)
            r0.f30571a = r5
            r0.f30574d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.P4(S5.d):java.lang.Object");
    }

    private final void Q3() {
        this.f30546r0 = true;
        AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2704k(null), 3, null);
    }

    private final void Q4() {
        if (this.f30541X != null) {
            ArrayList arrayList = this.f30545q0;
            AbstractC3255y.f(arrayList);
            File file = this.f30541X;
            AbstractC3255y.f(file);
            new L4.b(arrayList, file, this.f30556y0, this.f30546r0, this);
            return;
        }
        if (this.f30537T != null) {
            ArrayList arrayList2 = this.f30545q0;
            AbstractC3255y.f(arrayList2);
            DocumentFile documentFile = this.f30537T;
            AbstractC3255y.f(documentFile);
            new L4.b(arrayList2, documentFile, this.f30556y0, this.f30546r0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R3(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.core.activities.FileExplorerActivity.C2705l
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.core.activities.FileExplorerActivity$l r0 = (com.uptodown.core.activities.FileExplorerActivity.C2705l) r0
            int r1 = r0.f30636d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30636d = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$l r0 = new com.uptodown.core.activities.FileExplorerActivity$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30634b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30636d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f30633a
            com.uptodown.core.activities.FileExplorerActivity r2 = (com.uptodown.core.activities.FileExplorerActivity) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            com.uptodown.core.activities.FileExplorerActivity$m r2 = new com.uptodown.core.activities.FileExplorerActivity$m
            r2.<init>(r5)
            r0.f30633a = r6
            r0.f30636d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            com.uptodown.core.activities.FileExplorerActivity$n r4 = new com.uptodown.core.activities.FileExplorerActivity$n
            r4.<init>(r5)
            r0.f30633a = r5
            r0.f30636d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.R3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(FileExplorerActivity this$0, ActivityResult activityResult) {
        String str;
        Uri uri;
        Bundle extras;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 145) {
            Intent data = activityResult.getData();
            TextView textView = null;
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("path_selected");
            } else {
                str = null;
            }
            this$0.f30552w0 = str;
            if (str != null) {
                this$0.f30550v0 = null;
                TextView textView2 = this$0.f30523F;
                if (textView2 == null) {
                    AbstractC3255y.y("tvSelectedPath");
                } else {
                    textView = textView2;
                }
                textView.setText(this$0.f30552w0);
                return;
            }
            Intent data2 = activityResult.getData();
            if (data2 != null) {
                uri = data2.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                this$0.f30550v0 = uri;
                this$0.f30552w0 = null;
                String lastPathSegment = uri.getLastPathSegment();
                AbstractC3255y.f(lastPathSegment);
                String substring = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3255y.h(substring, "this as java.lang.String).substring(startIndex)");
                TextView textView3 = this$0.f30523F;
                if (textView3 == null) {
                    AbstractC3255y.y("tvSelectedPath");
                } else {
                    textView = textView3;
                }
                textView.setText(this$0.getString(h.f3799k0) + '/' + substring);
            }
        }
    }

    private final InterfaceC3390x0 S3(DocumentFile documentFile, Uri uri, M4.e eVar) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2711r(documentFile, uri, eVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S4() {
        LinearLayout linearLayout = this.f30520C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3255y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.getChildCount() > 1) {
            LinearLayout linearLayout3 = this.f30520C;
            if (linearLayout3 == null) {
                AbstractC3255y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            LinearLayout linearLayout4 = this.f30520C;
            if (linearLayout4 == null) {
                AbstractC3255y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout4;
            }
            linearLayout3.removeViewAt(linearLayout2.getChildCount() - 1);
        }
    }

    private final InterfaceC3390x0 T3(DocumentFile documentFile, String str, M4.e eVar) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2710q(documentFile, str, eVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T4() {
        LinearLayout linearLayout = this.f30520C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3255y.y("llBreadcrumb");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = getLayoutInflater();
        int i8 = H4.f.f3730b;
        LinearLayout linearLayout3 = this.f30520C;
        if (linearLayout3 == null) {
            AbstractC3255y.y("llBreadcrumb");
            linearLayout3 = null;
        }
        View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
        AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout4 = (LinearLayout) inflate;
        TextView textView = (TextView) linearLayout4.findViewById(e.f3719w1);
        if (this.f30543Z) {
            textView.setText(getString(h.f3799k0));
        } else {
            textView.setText(getString(h.f3772U));
        }
        textView.setTypeface(j.f3824g.u());
        LinearLayout linearLayout5 = this.f30520C;
        if (linearLayout5 == null) {
            AbstractC3255y.y("llBreadcrumb");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.addView(linearLayout4);
    }

    private final InterfaceC3390x0 U3(File file, Uri uri, M4.e eVar) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2709p(file, uri, eVar, this, null), 3, null);
        return d8;
    }

    private final void U4() {
        Intent intent = new Intent();
        DocumentFile documentFile = this.f30537T;
        if (documentFile != null) {
            AbstractC3255y.f(documentFile);
            if (documentFile.canWrite()) {
                DocumentFile documentFile2 = this.f30537T;
                AbstractC3255y.f(documentFile2);
                intent.setData(documentFile2.getUri());
            } else {
                n5();
                return;
            }
        } else {
            File file = this.f30541X;
            AbstractC3255y.f(file);
            if (file.canWrite()) {
                File file2 = this.f30541X;
                AbstractC3255y.f(file2);
                intent.putExtra("path_selected", file2.getAbsolutePath());
            } else {
                n5();
                return;
            }
        }
        intent.putExtra("sdcard_selected", this.f30543Z);
        setResult(145, intent);
        finish();
    }

    private final InterfaceC3390x0 V3(File file, String str, M4.e eVar) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2708o(file, str, eVar, this, null), 3, null);
        return d8;
    }

    private final void V4() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: I4.C
            @Override // java.lang.Runnable
            public final void run() {
                FileExplorerActivity.W4(FileExplorerActivity.this);
            }
        });
    }

    private final void W3() {
        AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2712s(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W4(FileExplorerActivity this$0) {
        AbstractC3255y.i(this$0, "this$0");
        HorizontalScrollView horizontalScrollView = this$0.f30521D;
        LinearLayout linearLayout = null;
        if (horizontalScrollView == null) {
            AbstractC3255y.y("svBreadcrumb");
            horizontalScrollView = null;
        }
        LinearLayout linearLayout2 = this$0.f30520C;
        if (linearLayout2 == null) {
            AbstractC3255y.y("llBreadcrumb");
            linearLayout2 = null;
        }
        int right = linearLayout2.getRight();
        LinearLayout linearLayout3 = this$0.f30520C;
        if (linearLayout3 == null) {
            AbstractC3255y.y("llBreadcrumb");
        } else {
            linearLayout = linearLayout3;
        }
        horizontalScrollView.scrollTo(right, linearLayout.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X3(S5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.FileExplorerActivity.C2713t
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.FileExplorerActivity$t r0 = (com.uptodown.core.activities.FileExplorerActivity.C2713t) r0
            int r1 = r0.f30675e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30675e = r1
            goto L18
        L13:
            com.uptodown.core.activities.FileExplorerActivity$t r0 = new com.uptodown.core.activities.FileExplorerActivity$t
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30673c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30675e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            O5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f30672b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r4 = r0.f30671a
            com.uptodown.core.activities.FileExplorerActivity r4 = (com.uptodown.core.activities.FileExplorerActivity) r4
            O5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f30672b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r5 = r0.f30671a
            com.uptodown.core.activities.FileExplorerActivity r5 = (com.uptodown.core.activities.FileExplorerActivity) r5
            O5.t.b(r9)
            goto L70
        L50:
            O5.t.b(r9)
            kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
            r9.<init>()
            l6.J0 r2 = l6.C3347b0.c()
            com.uptodown.core.activities.FileExplorerActivity$u r7 = new com.uptodown.core.activities.FileExplorerActivity$u
            r7.<init>(r6)
            r0.f30671a = r8
            r0.f30672b = r9
            r0.f30675e = r5
            java.lang.Object r2 = l6.AbstractC3360i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            l6.I r9 = l6.C3347b0.b()
            com.uptodown.core.activities.FileExplorerActivity$v r7 = new com.uptodown.core.activities.FileExplorerActivity$v
            r7.<init>(r2, r6)
            r0.f30671a = r5
            r0.f30672b = r2
            r0.f30675e = r4
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            l6.J0 r9 = l6.C3347b0.c()
            com.uptodown.core.activities.FileExplorerActivity$w r5 = new com.uptodown.core.activities.FileExplorerActivity$w
            r5.<init>(r2, r6)
            r0.f30671a = r6
            r0.f30672b = r6
            r0.f30675e = r3
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            O5.I r9 = O5.I.f8278a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.FileExplorerActivity.X3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4(String str) {
        CharSequence charSequence;
        boolean q8 = new J4.a(this).q();
        if (str == null) {
            SearchView searchView = this.f30525H;
            if (searchView != null) {
                charSequence = searchView.getQuery();
            } else {
                charSequence = null;
            }
            str = String.valueOf(charSequence);
        }
        if (str.length() > 0 || !q8) {
            ArrayList arrayList = this.f30539V;
            if (arrayList != null) {
                AbstractC3255y.f(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    File file = (File) obj;
                    String name = file.getName();
                    AbstractC3255y.h(name, "file.name");
                    if (n.F(name, str, true)) {
                        if (!q8) {
                            String name2 = file.getName();
                            AbstractC3255y.h(name2, "file.name");
                            if (!n.C(name2, ".", false, 2, null)) {
                            }
                        }
                        arrayList2.add(obj);
                    }
                }
                this.f30540W = arrayList2;
                return;
            }
            ArrayList arrayList3 = this.f30535R;
            if (arrayList3 != null) {
                AbstractC3255y.f(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    DocumentFile documentFile = (DocumentFile) obj2;
                    String name3 = documentFile.getName();
                    AbstractC3255y.f(name3);
                    if (n.F(name3, str, true)) {
                        if (!q8) {
                            String name4 = documentFile.getName();
                            AbstractC3255y.f(name4);
                            if (!n.C(name4, ".", false, 2, null)) {
                            }
                        }
                        arrayList4.add(obj2);
                    }
                }
                this.f30536S = arrayList4;
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30539V;
        if (arrayList5 != null) {
            this.f30540W = arrayList5;
            return;
        }
        ArrayList arrayList6 = this.f30535R;
        if (arrayList6 != null) {
            this.f30536S = arrayList6;
        }
    }

    private final void Y3(Object obj) {
        kotlin.jvm.internal.T t8;
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3255y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(H4.f.f3735g, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(e.f3653a1);
            j.a aVar = j.f3824g;
            textView.setTypeface(aVar.t());
            TextView textView2 = (TextView) inflate.findViewById(e.f3628S0);
            textView2.setTypeface(aVar.u());
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(e.f3633U);
            final EditText editText = (EditText) inflate.findViewById(e.f3690n);
            editText.setTypeface(aVar.u());
            TextView textView3 = (TextView) inflate.findViewById(e.f3637V0);
            textView3.setTypeface(aVar.u());
            textView3.setText(".zip");
            ((TextView) inflate.findViewById(e.f3646Y0)).setTypeface(aVar.u());
            TextView textView4 = (TextView) inflate.findViewById(e.f3643X0);
            textView4.setTypeface(aVar.u());
            TextView textView5 = (TextView) inflate.findViewById(e.f3602J1);
            textView5.setTypeface(aVar.t());
            TextView textView6 = (TextView) inflate.findViewById(e.f3691n0);
            textView6.setTypeface(aVar.t());
            TextView textView7 = (TextView) inflate.findViewById(e.f3574A0);
            textView7.setTypeface(aVar.t());
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(e.f3582D);
            kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            ArrayList arrayList = new ArrayList();
            t9.f34162a = arrayList;
            if (obj != null) {
                arrayList.add(obj);
            } else {
                b bVar = this.f30534Q;
                AbstractC3255y.f(bVar);
                t9.f34162a = bVar.b();
            }
            final ArrayList arrayList2 = new ArrayList();
            if (!((Collection) t9.f34162a).isEmpty()) {
                Iterator it = ((ArrayList) t9.f34162a).iterator();
                String str = "";
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    kotlin.jvm.internal.T t10 = t9;
                    if (next instanceof File) {
                        str = str + ((File) next).getName() + '\n';
                        arrayList2.add(next);
                    } else if (next instanceof DocumentFile) {
                        str = str + ((DocumentFile) next).getName() + '\n';
                    }
                    it = it2;
                    t9 = t10;
                }
                t8 = t9;
                textView4.setText(str);
            } else {
                t8 = t9;
            }
            final kotlin.jvm.internal.T t11 = new kotlin.jvm.internal.T();
            final C2717x c2717x = new C2717x(progressBar, textView5, editText, this, textView6, textView2, relativeLayout, textView7);
            final kotlin.jvm.internal.T t12 = t8;
            textView6.setOnClickListener(new View.OnClickListener() { // from class: I4.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.Z3(editText, t12, this, arrayList2, t11, c2717x, view);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() { // from class: I4.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.a4(kotlin.jvm.internal.T.this, this, view);
                }
            });
            builder.setView(inflate);
            this.f30531N = builder.create();
            if (!isFinishing() && (alertDialog = this.f30531N) != null) {
                AbstractC3255y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f30531N;
                AbstractC3255y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y4() {
        String str;
        DocumentFile documentFile = this.f30537T;
        RecyclerView recyclerView = null;
        if (documentFile != null) {
            AbstractC3255y.f(documentFile);
            String lastPathSegment = documentFile.getUri().getLastPathSegment();
            if (lastPathSegment != null) {
                str = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3255y.h(str, "this as java.lang.String).substring(startIndex)");
            } else {
                str = "";
            }
            if (this.f30543Z) {
                if (str.length() == 0) {
                    TextView textView = this.f30551w;
                    if (textView == null) {
                        AbstractC3255y.y("tvBreadCrumb");
                        textView = null;
                    }
                    textView.setText(getString(h.f3799k0));
                } else {
                    s3();
                }
            } else {
                TextView textView2 = this.f30551w;
                if (textView2 == null) {
                    AbstractC3255y.y("tvBreadCrumb");
                    textView2 = null;
                }
                textView2.setText(getString(h.f3772U) + '/' + str);
            }
        } else {
            File file = this.f30541X;
            if (file != null) {
                if (AbstractC3255y.d(file, Environment.getExternalStorageDirectory())) {
                    TextView textView3 = this.f30551w;
                    if (textView3 == null) {
                        AbstractC3255y.y("tvBreadCrumb");
                        textView3 = null;
                    }
                    textView3.setText(getString(h.f3772U));
                } else {
                    t3();
                }
            }
        }
        if (this.f30534Q == null) {
            this.f30534Q = new b(this.f30554x0);
            RecyclerView recyclerView2 = this.f30553x;
            if (recyclerView2 == null) {
                AbstractC3255y.y("rvFiles");
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setAdapter(this.f30534Q);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f30536S;
        if (arrayList2 != null) {
            AbstractC3255y.f(arrayList2);
            arrayList.addAll(arrayList2);
        } else {
            ArrayList arrayList3 = this.f30540W;
            if (arrayList3 != null) {
                AbstractC3255y.f(arrayList3);
                arrayList.addAll(arrayList3);
            }
        }
        b bVar = this.f30534Q;
        AbstractC3255y.f(bVar);
        bVar.g(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(EditText editText, kotlin.jvm.internal.T itemsToCompress, FileExplorerActivity this$0, ArrayList filesPath, kotlin.jvm.internal.T compressFilesJob, C2717x compressListener, View view) {
        int i8;
        String str;
        AbstractC3255y.i(itemsToCompress, "$itemsToCompress");
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(filesPath, "$filesPath");
        AbstractC3255y.i(compressFilesJob, "$compressFilesJob");
        AbstractC3255y.i(compressListener, "$compressListener");
        if (editText.getText().toString().length() > 0) {
            if (!((Collection) itemsToCompress.f34162a).isEmpty()) {
                File file = this$0.f30541X;
                long j8 = 0;
                if (file != null) {
                    AbstractC3255y.f(file);
                    long usableSpace = file.getUsableSpace();
                    Iterator it = filesPath.iterator();
                    while (it.hasNext()) {
                        j8 += ((File) it.next()).length();
                    }
                    if (usableSpace > j8 * 2) {
                        StringBuilder sb = new StringBuilder();
                        File file2 = this$0.f30541X;
                        if (file2 != null) {
                            str = file2.getAbsolutePath();
                        } else {
                            str = null;
                        }
                        sb.append(str);
                        sb.append('/');
                        sb.append((Object) editText.getText());
                        sb.append(".zip");
                        File file3 = new File(sb.toString());
                        if (!file3.exists()) {
                            j.f3824g.d(this$0, editText);
                            compressFilesJob.f34162a = this$0.A3(filesPath, file3, compressListener);
                            return;
                        } else {
                            Toast.makeText(this$0, this$0.getString(h.f3788f, editText.getText()), 0).show();
                            return;
                        }
                    }
                    Toast.makeText(this$0, this$0.getString(h.f3759H), 0).show();
                    return;
                }
                if (this$0.f30537T != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ArrayList) itemsToCompress.f34162a).iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof DocumentFile) {
                            arrayList.add(next);
                        }
                    }
                    Q4.f fVar = new Q4.f();
                    Context applicationContext = this$0.getApplicationContext();
                    AbstractC3255y.h(applicationContext, "applicationContext");
                    DocumentFile documentFile = this$0.f30537T;
                    AbstractC3255y.f(documentFile);
                    long l8 = fVar.l(applicationContext, documentFile);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        j8 += ((DocumentFile) it3.next()).length();
                    }
                    if (l8 > j8 * 2) {
                        String str2 = ((Object) editText.getText()) + ".zip";
                        DocumentFile documentFile2 = this$0.f30537T;
                        AbstractC3255y.f(documentFile2);
                        DocumentFile[] listFiles = documentFile2.listFiles();
                        AbstractC3255y.h(listFiles, "currentDirectoryDocumentFile!!.listFiles()");
                        int length = listFiles.length;
                        boolean z8 = false;
                        int i9 = 0;
                        while (i9 < length) {
                            if (AbstractC3255y.d(listFiles[i9].getName(), str2)) {
                                i8 = 1;
                                Toast.makeText(this$0, this$0.getString(h.f3788f, editText.getText()), 0).show();
                                z8 = true;
                            } else {
                                i8 = 1;
                            }
                            i9 += i8;
                        }
                        if (!z8) {
                            j.f3824g.d(this$0, editText);
                            DocumentFile documentFile3 = this$0.f30537T;
                            AbstractC3255y.f(documentFile3);
                            DocumentFile createFile = documentFile3.createFile(new Q4.f().i(str2), str2);
                            AbstractC3255y.f(createFile);
                            compressFilesJob.f34162a = this$0.z3(arrayList, createFile, compressListener);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Toast.makeText(this$0, h.f3790g, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z4() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            this.f30541X = externalStorageDirectory;
            this.f30537T = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(kotlin.jvm.internal.T compressFilesJob, FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(compressFilesJob, "$compressFilesJob");
        AbstractC3255y.i(this$0, "this$0");
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) compressFilesJob.f34162a;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        AlertDialog alertDialog = this$0.f30531N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a5() {
        int i8;
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        Menu menu8;
        b bVar = this.f30534Q;
        if (bVar != null) {
            AbstractC3255y.f(bVar);
            i8 = bVar.a();
        } else {
            i8 = 0;
        }
        MenuItem menuItem7 = null;
        if (i8 > 0) {
            Toolbar toolbar = this.f30532O;
            if (toolbar != null && (menu8 = toolbar.getMenu()) != null) {
                menuItem4 = menu8.findItem(e.f3663e);
            } else {
                menuItem4 = null;
            }
            if (menuItem4 != null) {
                menuItem4.setEnabled(true);
            }
            Toolbar toolbar2 = this.f30532O;
            if (toolbar2 != null && (menu7 = toolbar2.getMenu()) != null) {
                menuItem5 = menu7.findItem(e.f3654b);
            } else {
                menuItem5 = null;
            }
            if (menuItem5 != null) {
                menuItem5.setEnabled(true);
            }
            Toolbar toolbar3 = this.f30532O;
            if (toolbar3 != null && (menu6 = toolbar3.getMenu()) != null) {
                menuItem6 = menu6.findItem(e.f3660d);
            } else {
                menuItem6 = null;
            }
            if (menuItem6 != null) {
                menuItem6.setEnabled(true);
            }
            Toolbar toolbar4 = this.f30532O;
            if (toolbar4 != null && (menu5 = toolbar4.getMenu()) != null) {
                menuItem7 = menu5.findItem(e.f3651a);
            }
            if (menuItem7 != null) {
                menuItem7.setEnabled(true);
            }
        } else {
            Toolbar toolbar5 = this.f30532O;
            if (toolbar5 != null && (menu4 = toolbar5.getMenu()) != null) {
                menuItem = menu4.findItem(e.f3663e);
            } else {
                menuItem = null;
            }
            if (menuItem != null) {
                menuItem.setEnabled(false);
            }
            Toolbar toolbar6 = this.f30532O;
            if (toolbar6 != null && (menu3 = toolbar6.getMenu()) != null) {
                menuItem2 = menu3.findItem(e.f3654b);
            } else {
                menuItem2 = null;
            }
            if (menuItem2 != null) {
                menuItem2.setEnabled(false);
            }
            Toolbar toolbar7 = this.f30532O;
            if (toolbar7 != null && (menu2 = toolbar7.getMenu()) != null) {
                menuItem3 = menu2.findItem(e.f3660d);
            } else {
                menuItem3 = null;
            }
            if (menuItem3 != null) {
                menuItem3.setEnabled(false);
            }
            Toolbar toolbar8 = this.f30532O;
            if (toolbar8 != null && (menu = toolbar8.getMenu()) != null) {
                menuItem7 = menu.findItem(e.f3651a);
            }
            if (menuItem7 != null) {
                menuItem7.setEnabled(false);
            }
        }
        TextView textView = this.f30533P;
        if (textView != null) {
            textView.setText(getString(h.f3752A, String.valueOf(i8)));
        }
    }

    private final void b4() {
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3255y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(H4.f.f3737i, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(e.f3656b1);
            j.a aVar = j.f3824g;
            textView.setTypeface(aVar.t());
            ((TextView) inflate.findViewById(e.f3631T0)).setTypeface(aVar.u());
            final EditText editText = (EditText) inflate.findViewById(e.f3693o);
            editText.setTypeface(aVar.u());
            TextView textView2 = (TextView) inflate.findViewById(e.f3694o0);
            textView2.setTypeface(aVar.t());
            TextView textView3 = (TextView) inflate.findViewById(e.f3577B0);
            textView3.setTypeface(aVar.t());
            textView2.setOnClickListener(new View.OnClickListener() { // from class: I4.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.c4(editText, this, view);
                }
            });
            textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.d4(FileExplorerActivity.this, view);
                }
            });
            builder.setView(inflate);
            this.f30531N = builder.create();
            if (!isFinishing() && (alertDialog = this.f30531N) != null) {
                AbstractC3255y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f30531N;
                AbstractC3255y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    private final void b5() {
        if (!this.f30542Y) {
            RadioButton radioButton = this.f30530M;
            AbstractC3255y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, H4.d.f3562j));
            RadioButton radioButton2 = this.f30529L;
            AbstractC3255y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, H4.d.f3565m));
            RadioButton radioButton3 = this.f30528K;
            AbstractC3255y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, H4.d.f3557e));
            return;
        }
        RadioButton radioButton4 = this.f30530M;
        AbstractC3255y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, H4.d.f3564l));
        RadioButton radioButton5 = this.f30529L;
        AbstractC3255y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, H4.d.f3567o));
        RadioButton radioButton6 = this.f30528K;
        AbstractC3255y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, H4.d.f3559g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(EditText editText, FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (editText.getText().toString().length() > 0) {
            AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2718y(editText, null), 3, null);
        } else {
            Toast.makeText(this$0, h.f3790g, 0).show();
        }
    }

    private final void c5() {
        if (!this.f30542Y) {
            RadioButton radioButton = this.f30528K;
            AbstractC3255y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, H4.d.f3558f));
            RadioButton radioButton2 = this.f30529L;
            AbstractC3255y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, H4.d.f3565m));
            RadioButton radioButton3 = this.f30530M;
            AbstractC3255y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, H4.d.f3561i));
            return;
        }
        RadioButton radioButton4 = this.f30528K;
        AbstractC3255y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, H4.d.f3560h));
        RadioButton radioButton5 = this.f30529L;
        AbstractC3255y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, H4.d.f3567o));
        RadioButton radioButton6 = this.f30530M;
        AbstractC3255y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, H4.d.f3563k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30531N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void d5() {
        if (!this.f30542Y) {
            RadioButton radioButton = this.f30529L;
            AbstractC3255y.f(radioButton);
            radioButton.setBackground(ContextCompat.getDrawable(this, H4.d.f3566n));
            RadioButton radioButton2 = this.f30528K;
            AbstractC3255y.f(radioButton2);
            radioButton2.setBackground(ContextCompat.getDrawable(this, H4.d.f3557e));
            RadioButton radioButton3 = this.f30530M;
            AbstractC3255y.f(radioButton3);
            radioButton3.setBackground(ContextCompat.getDrawable(this, H4.d.f3561i));
            return;
        }
        RadioButton radioButton4 = this.f30529L;
        AbstractC3255y.f(radioButton4);
        radioButton4.setBackground(ContextCompat.getDrawable(this, H4.d.f3568p));
        RadioButton radioButton5 = this.f30528K;
        AbstractC3255y.f(radioButton5);
        radioButton5.setBackground(ContextCompat.getDrawable(this, H4.d.f3559g));
        RadioButton radioButton6 = this.f30530M;
        AbstractC3255y.f(radioButton6);
        radioButton6.setBackground(ContextCompat.getDrawable(this, H4.d.f3563k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e4(final Object obj) {
        String str;
        AlertDialog alertDialog;
        if (!isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3255y.h(layoutInflater, "layoutInflater");
            TextView textView = null;
            View inflate = layoutInflater.inflate(H4.f.f3738j, (ViewGroup) null, false);
            TextView textView2 = (TextView) inflate.findViewById(e.f3659c1);
            j.a aVar = j.f3824g;
            textView2.setTypeface(aVar.t());
            TextView textView3 = (TextView) inflate.findViewById(e.f3634U0);
            textView3.setTypeface(aVar.u());
            RadioButton radioButton = (RadioButton) inflate.findViewById(e.f3603K);
            radioButton.setTypeface(aVar.u());
            RadioButton radioButton2 = (RadioButton) inflate.findViewById(e.f3606L);
            radioButton2.setTypeface(aVar.u());
            View findViewById = inflate.findViewById(e.f3625R0);
            AbstractC3255y.h(findViewById, "view.findViewById(R.id.t…decompress_selected_path)");
            TextView textView4 = (TextView) findViewById;
            this.f30523F = textView4;
            if (textView4 == null) {
                AbstractC3255y.y("tvSelectedPath");
                textView4 = null;
            }
            textView4.setTypeface(aVar.u());
            final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
            if (obj instanceof File) {
                t8.f34162a = ((File) obj).getParent();
            } else if (obj instanceof DocumentFile) {
                DocumentFile documentFile = this.f30537T;
                AbstractC3255y.f(documentFile);
                String lastPathSegment = documentFile.getUri().getLastPathSegment();
                if (lastPathSegment != null) {
                    DocumentFile documentFile2 = this.f30537T;
                    AbstractC3255y.f(documentFile2);
                    String lastPathSegment2 = documentFile2.getUri().getLastPathSegment();
                    AbstractC3255y.f(lastPathSegment2);
                    str = lastPathSegment.substring(n.X(lastPathSegment2, ":", 0, false, 6, null) + 1);
                    AbstractC3255y.h(str, "this as java.lang.String).substring(startIndex)");
                } else {
                    str = null;
                }
                t8.f34162a = getString(h.f3799k0) + '/' + str;
            }
            TextView textView5 = this.f30523F;
            if (textView5 == null) {
                AbstractC3255y.y("tvSelectedPath");
                textView5 = null;
            }
            textView5.setText((CharSequence) t8.f34162a);
            this.f30552w0 = (String) t8.f34162a;
            TextView textView6 = (TextView) inflate.findViewById(e.f3691n0);
            textView6.setTypeface(aVar.t());
            TextView textView7 = (TextView) inflate.findViewById(e.f3580C0);
            textView7.setTypeface(aVar.t());
            ProgressBar progressBar = (ProgressBar) inflate.findViewById(e.f3585E);
            TextView textView8 = this.f30523F;
            if (textView8 == null) {
                AbstractC3255y.y("tvSelectedPath");
            } else {
                textView = textView8;
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: I4.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.f4(FileExplorerActivity.this, view);
                }
            });
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: I4.S
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    FileExplorerActivity.g4(FileExplorerActivity.this, t8, compoundButton, z8);
                }
            });
            radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: I4.T
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                    FileExplorerActivity.h4(FileExplorerActivity.this, compoundButton, z8);
                }
            });
            final kotlin.jvm.internal.T t9 = new kotlin.jvm.internal.T();
            final C2719z c2719z = new C2719z(textView3, this, inflate, progressBar, textView6, textView7);
            textView6.setOnClickListener(new View.OnClickListener() { // from class: I4.U
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.i4(obj, this, t9, c2719z, view);
                }
            });
            textView7.setOnClickListener(new View.OnClickListener() { // from class: I4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.j4(kotlin.jvm.internal.T.this, this, view);
                }
            });
            builder.setView(inflate);
            this.f30531N = builder.create();
            if (!isFinishing() && (alertDialog = this.f30531N) != null) {
                AbstractC3255y.f(alertDialog);
                Window window = alertDialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                AlertDialog alertDialog2 = this.f30531N;
                AbstractC3255y.f(alertDialog2);
                alertDialog2.show();
            }
        }
    }

    private final void e5(boolean z8) {
        LinearLayout linearLayout = null;
        if (z8) {
            TextView textView = this.f30522E;
            if (textView == null) {
                AbstractC3255y.y("tvEmptyDirectory");
                textView = null;
            }
            textView.setText(getString(h.f3757F));
        } else {
            TextView textView2 = this.f30522E;
            if (textView2 == null) {
                AbstractC3255y.y("tvEmptyDirectory");
                textView2 = null;
            }
            textView2.setText(getString(h.f3785d0));
        }
        LinearLayout linearLayout2 = this.f30518B;
        if (linearLayout2 == null) {
            AbstractC3255y.y("llEmptyDirectory");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getApplicationContext(), (Class<?>) FileExplorerActivity.class);
        intent.putExtra("select_path", 1);
        this$0.f30519B0.launch(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f5(String str) {
        int i8 = 0;
        if (str != null) {
            ArrayList arrayList = this.f30536S;
            if (arrayList != null) {
                AbstractC3255y.f(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DocumentFile documentFile = (DocumentFile) it.next();
                    if (documentFile.getName() != null && n.s(documentFile.getName(), str, true)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            } else {
                ArrayList arrayList2 = this.f30540W;
                if (arrayList2 != null) {
                    AbstractC3255y.f(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext() && !n.s(((File) it2.next()).getName(), str, true)) {
                        i8++;
                    }
                }
            }
        }
        RecyclerView recyclerView = this.f30553x;
        if (recyclerView == null) {
            AbstractC3255y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.scrollToPosition(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(FileExplorerActivity this$0, kotlin.jvm.internal.T parentPath, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(parentPath, "$parentPath");
        if (z8) {
            TextView textView = this$0.f30523F;
            TextView textView2 = null;
            if (textView == null) {
                AbstractC3255y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView3 = this$0.f30523F;
            if (textView3 == null) {
                AbstractC3255y.y("tvSelectedPath");
            } else {
                textView2 = textView3;
            }
            textView2.setText((CharSequence) parentPath.f34162a);
        }
    }

    private final void g5(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", new File(str));
            intent.setType(getContentResolver().getType(uriForFile));
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            startActivity(Intent.createChooser(intent, getString(h.f3771T)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h4(FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            TextView textView = this$0.f30523F;
            if (textView == null) {
                AbstractC3255y.y("tvSelectedPath");
                textView = null;
            }
            textView.setVisibility(0);
        }
    }

    private final void h5() {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        Toolbar toolbar = this.f30532O;
        MenuItem menuItem7 = null;
        if (toolbar != null && (menu7 = toolbar.getMenu()) != null) {
            menuItem = menu7.findItem(e.f3669g);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        Toolbar toolbar2 = this.f30532O;
        if (toolbar2 != null && (menu6 = toolbar2.getMenu()) != null) {
            menuItem2 = menu6.findItem(e.f3663e);
        } else {
            menuItem2 = null;
        }
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        Toolbar toolbar3 = this.f30532O;
        if (toolbar3 != null && (menu5 = toolbar3.getMenu()) != null) {
            menuItem3 = menu5.findItem(e.f3657c);
        } else {
            menuItem3 = null;
        }
        if (menuItem3 != null) {
            menuItem3.setVisible(true);
        }
        Toolbar toolbar4 = this.f30532O;
        if (toolbar4 != null && (menu4 = toolbar4.getMenu()) != null) {
            menuItem4 = menu4.findItem(e.f3654b);
        } else {
            menuItem4 = null;
        }
        if (menuItem4 != null) {
            menuItem4.setVisible(true);
        }
        Toolbar toolbar5 = this.f30532O;
        if (toolbar5 != null && (menu3 = toolbar5.getMenu()) != null) {
            menuItem5 = menu3.findItem(e.f3651a);
        } else {
            menuItem5 = null;
        }
        if (menuItem5 != null) {
            menuItem5.setVisible(true);
        }
        Toolbar toolbar6 = this.f30532O;
        if (toolbar6 != null && (menu2 = toolbar6.getMenu()) != null) {
            menuItem6 = menu2.findItem(e.f3660d);
        } else {
            menuItem6 = null;
        }
        if (menuItem6 != null) {
            menuItem6.setVisible(true);
        }
        a5();
        ArrayList arrayList = this.f30545q0;
        if (arrayList != null) {
            AbstractC3255y.f(arrayList);
            if (!arrayList.isEmpty()) {
                Toolbar toolbar7 = this.f30532O;
                if (toolbar7 != null && (menu = toolbar7.getMenu()) != null) {
                    menuItem7 = menu.findItem(e.f3666f);
                }
                if (menuItem7 != null) {
                    menuItem7.setVisible(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(Object file, FileExplorerActivity this$0, kotlin.jvm.internal.T decompressFilesJob, C2719z decompressFileListener, View view) {
        long usableSpace;
        Long l8;
        AbstractC3255y.i(file, "$file");
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(decompressFilesJob, "$decompressFilesJob");
        AbstractC3255y.i(decompressFileListener, "$decompressFileListener");
        if (file instanceof File) {
            if (this$0.f30552w0 != null) {
                File file2 = this$0.f30541X;
                if (file2 != null) {
                    l8 = Long.valueOf(file2.getUsableSpace());
                } else {
                    l8 = null;
                }
                AbstractC3255y.f(l8);
                File file3 = (File) file;
                if (l8.longValue() > file3.length() * 2) {
                    String str = this$0.f30552w0;
                    AbstractC3255y.f(str);
                    decompressFilesJob.f34162a = this$0.V3(file3, str, decompressFileListener);
                    return;
                }
                return;
            }
            if (this$0.f30550v0 != null) {
                Q4.f fVar = new Q4.f();
                Context applicationContext = this$0.getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                Uri uri = this$0.f30550v0;
                AbstractC3255y.f(uri);
                File file4 = (File) file;
                if (fVar.k(applicationContext, uri) > file4.length() * 2) {
                    Uri uri2 = this$0.f30550v0;
                    AbstractC3255y.f(uri2);
                    decompressFilesJob.f34162a = this$0.U3(file4, uri2, decompressFileListener);
                    return;
                }
                return;
            }
            return;
        }
        if (file instanceof DocumentFile) {
            if (this$0.f30552w0 != null) {
                File file5 = this$0.f30541X;
                if (file5 == null) {
                    File externalStorageDirectory = Environment.getExternalStorageDirectory();
                    if (externalStorageDirectory != null) {
                        usableSpace = externalStorageDirectory.getUsableSpace();
                    } else {
                        usableSpace = 0;
                    }
                } else {
                    AbstractC3255y.f(file5);
                    usableSpace = file5.getUsableSpace();
                }
                DocumentFile documentFile = (DocumentFile) file;
                if (usableSpace > documentFile.length() * 2) {
                    String str2 = this$0.f30552w0;
                    AbstractC3255y.f(str2);
                    decompressFilesJob.f34162a = this$0.T3(documentFile, str2, decompressFileListener);
                    return;
                }
                return;
            }
            if (this$0.f30550v0 != null) {
                Q4.f fVar2 = new Q4.f();
                Context applicationContext2 = this$0.getApplicationContext();
                AbstractC3255y.h(applicationContext2, "applicationContext");
                Uri uri3 = this$0.f30550v0;
                AbstractC3255y.f(uri3);
                DocumentFile documentFile2 = (DocumentFile) file;
                if (fVar2.k(applicationContext2, uri3) > documentFile2.length() * 2) {
                    Uri uri4 = this$0.f30550v0;
                    AbstractC3255y.f(uri4);
                    decompressFilesJob.f34162a = this$0.S3(documentFile2, uri4, decompressFileListener);
                    return;
                }
                return;
            }
            DocumentFile documentFile3 = this$0.f30537T;
            if (documentFile3 != null) {
                AbstractC3255y.f(documentFile3);
                Uri uri5 = documentFile3.getUri();
                AbstractC3255y.h(uri5, "currentDirectoryDocumentFile!!.uri");
                decompressFilesJob.f34162a = this$0.S3((DocumentFile) file, uri5, decompressFileListener);
                return;
            }
            File file6 = this$0.f30541X;
            if (file6 != null) {
                AbstractC3255y.f(file6);
                String absolutePath = file6.getAbsolutePath();
                AbstractC3255y.h(absolutePath, "currentDirFile!!.absolutePath");
                decompressFilesJob.f34162a = this$0.T3((DocumentFile) file, absolutePath, decompressFileListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i5() {
        if (this.f30542Y) {
            ArrayList arrayList = this.f30536S;
            if (arrayList != null) {
                AbstractC3255y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1378t.B(arrayList, new P());
                }
                ArrayList arrayList2 = this.f30536S;
                AbstractC3255y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1378t.B(arrayList2, new Q());
                }
            }
            ArrayList arrayList3 = this.f30540W;
            if (arrayList3 != null) {
                AbstractC3255y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1378t.B(arrayList3, new R());
                }
                ArrayList arrayList4 = this.f30540W;
                AbstractC3255y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1378t.B(arrayList4, new S());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30536S;
        if (arrayList5 != null) {
            AbstractC3255y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1378t.B(arrayList5, new L());
            }
            ArrayList arrayList6 = this.f30536S;
            AbstractC3255y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1378t.B(arrayList6, new M());
            }
        }
        ArrayList arrayList7 = this.f30540W;
        if (arrayList7 != null) {
            AbstractC3255y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1378t.B(arrayList7, new N());
            }
            ArrayList arrayList8 = this.f30540W;
            AbstractC3255y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1378t.B(arrayList8, new O());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(kotlin.jvm.internal.T decompressFilesJob, FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(decompressFilesJob, "$decompressFilesJob");
        AbstractC3255y.i(this$0, "this$0");
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) decompressFilesJob.f34162a;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        AlertDialog alertDialog = this$0.f30531N;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j5() {
        if (this.f30542Y) {
            ArrayList arrayList = this.f30536S;
            if (arrayList != null) {
                AbstractC3255y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1378t.B(arrayList, new X());
                }
                ArrayList arrayList2 = this.f30536S;
                AbstractC3255y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1378t.B(arrayList2, new Y());
                }
            }
            ArrayList arrayList3 = this.f30540W;
            if (arrayList3 != null) {
                AbstractC3255y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1378t.B(arrayList3, new Z());
                }
                ArrayList arrayList4 = this.f30540W;
                AbstractC3255y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1378t.B(arrayList4, new a0());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30536S;
        if (arrayList5 != null) {
            AbstractC3255y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1378t.B(arrayList5, new T());
            }
            ArrayList arrayList6 = this.f30536S;
            AbstractC3255y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1378t.B(arrayList6, new U());
            }
        }
        ArrayList arrayList7 = this.f30540W;
        if (arrayList7 != null) {
            AbstractC3255y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1378t.B(arrayList7, new V());
            }
            ArrayList arrayList8 = this.f30540W;
            AbstractC3255y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1378t.B(arrayList8, new W());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k4() {
        MenuItem menuItem;
        MenuItem menuItem2;
        MenuItem menuItem3;
        MenuItem menuItem4;
        MenuItem menuItem5;
        MenuItem menuItem6;
        Menu menu;
        Menu menu2;
        Menu menu3;
        Menu menu4;
        Menu menu5;
        Menu menu6;
        Menu menu7;
        TextView textView = this.f30533P;
        if (textView != null) {
            textView.setText(getString(h.f3778a));
        }
        Toolbar toolbar = this.f30532O;
        MenuItem menuItem7 = null;
        if (toolbar != null && (menu7 = toolbar.getMenu()) != null) {
            menuItem = menu7.findItem(e.f3669g);
        } else {
            menuItem = null;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
        Toolbar toolbar2 = this.f30532O;
        if (toolbar2 != null && (menu6 = toolbar2.getMenu()) != null) {
            menuItem2 = menu6.findItem(e.f3657c);
        } else {
            menuItem2 = null;
        }
        if (menuItem2 != null) {
            menuItem2.setVisible(true);
        }
        Toolbar toolbar3 = this.f30532O;
        if (toolbar3 != null && (menu5 = toolbar3.getMenu()) != null) {
            menuItem3 = menu5.findItem(e.f3663e);
        } else {
            menuItem3 = null;
        }
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
        Toolbar toolbar4 = this.f30532O;
        if (toolbar4 != null && (menu4 = toolbar4.getMenu()) != null) {
            menuItem4 = menu4.findItem(e.f3654b);
        } else {
            menuItem4 = null;
        }
        if (menuItem4 != null) {
            menuItem4.setVisible(false);
        }
        Toolbar toolbar5 = this.f30532O;
        if (toolbar5 != null && (menu3 = toolbar5.getMenu()) != null) {
            menuItem5 = menu3.findItem(e.f3651a);
        } else {
            menuItem5 = null;
        }
        if (menuItem5 != null) {
            menuItem5.setVisible(false);
        }
        Toolbar toolbar6 = this.f30532O;
        if (toolbar6 != null && (menu2 = toolbar6.getMenu()) != null) {
            menuItem6 = menu2.findItem(e.f3660d);
        } else {
            menuItem6 = null;
        }
        if (menuItem6 != null) {
            menuItem6.setVisible(false);
        }
        Toolbar toolbar7 = this.f30532O;
        if (toolbar7 != null && (menu = toolbar7.getMenu()) != null) {
            menuItem7 = menu.findItem(e.f3666f);
        }
        if (menuItem7 != null) {
            menuItem7.setVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k5() {
        if (this.f30542Y) {
            ArrayList arrayList = this.f30536S;
            if (arrayList != null) {
                AbstractC3255y.f(arrayList);
                if (arrayList.size() > 1) {
                    AbstractC1378t.B(arrayList, new f0());
                }
                ArrayList arrayList2 = this.f30536S;
                AbstractC3255y.f(arrayList2);
                if (arrayList2.size() > 1) {
                    AbstractC1378t.B(arrayList2, new g0());
                }
            }
            ArrayList arrayList3 = this.f30540W;
            if (arrayList3 != null) {
                AbstractC3255y.f(arrayList3);
                if (arrayList3.size() > 1) {
                    AbstractC1378t.B(arrayList3, new h0());
                }
                ArrayList arrayList4 = this.f30540W;
                AbstractC3255y.f(arrayList4);
                if (arrayList4.size() > 1) {
                    AbstractC1378t.B(arrayList4, new i0());
                    return;
                }
                return;
            }
            return;
        }
        ArrayList arrayList5 = this.f30536S;
        if (arrayList5 != null) {
            AbstractC3255y.f(arrayList5);
            if (arrayList5.size() > 1) {
                AbstractC1378t.B(arrayList5, new b0());
            }
            ArrayList arrayList6 = this.f30536S;
            AbstractC3255y.f(arrayList6);
            if (arrayList6.size() > 1) {
                AbstractC1378t.B(arrayList6, new c0());
            }
        }
        ArrayList arrayList7 = this.f30540W;
        if (arrayList7 != null) {
            AbstractC3255y.f(arrayList7);
            if (arrayList7.size() > 1) {
                AbstractC1378t.B(arrayList7, new d0());
            }
            ArrayList arrayList8 = this.f30540W;
            AbstractC3255y.f(arrayList8);
            if (arrayList8.size() > 1) {
                AbstractC1378t.B(arrayList8, new e0());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l4(DocumentFile documentFile) {
        Application application = getApplication();
        AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        Uri uri = documentFile.getUri();
        AbstractC3255y.h(uri, "documentFile.uri");
        ((j) application).F(uri, new B(documentFile), this);
    }

    private final void l5(Uri uri) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setDataAndType(uri, getContentResolver().getType(uri));
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m4(File file) {
        Application application = getApplication();
        AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((j) application).G(file, new A(file), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m5() {
        b bVar = this.f30534Q;
        AbstractC3255y.f(bVar);
        bVar.i(false);
        k4();
        o4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n4(String str) {
        RelativeLayout relativeLayout = this.f30555y;
        if (relativeLayout == null) {
            AbstractC3255y.y("rlLoading");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(0);
        if (this.f30537T == null && this.f30541X == null) {
            Z4();
        }
        new L4.c(this.f30537T, this.f30541X, this, new D(str));
    }

    private final void n5() {
        Toast.makeText(this, getString(h.f3821y), 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o4(boolean z8) {
        SearchView searchView;
        if (z8 && (searchView = this.f30525H) != null) {
            y3(searchView);
        }
        n4(null);
    }

    static /* synthetic */ void p4(FileExplorerActivity fileExplorerActivity, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        fileExplorerActivity.o4(z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.U4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    private final void s3() {
        DocumentFile documentFile = this.f30537T;
        AbstractC3255y.f(documentFile);
        String lastPathSegment = documentFile.getUri().getLastPathSegment();
        LinearLayout linearLayout = this.f30520C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3255y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.findViewWithTag(lastPathSegment) == null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i8 = H4.f.f3729a;
            LinearLayout linearLayout3 = this.f30520C;
            if (linearLayout3 == null) {
                AbstractC3255y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
            AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout4 = (LinearLayout) inflate;
            linearLayout4.setTag(lastPathSegment);
            TextView textView = (TextView) linearLayout4.findViewById(e.f3709t0);
            AbstractC3255y.f(lastPathSegment);
            String substring = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
            AbstractC3255y.h(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() > 0) {
                String substring2 = lastPathSegment.substring(n.X(lastPathSegment, ":", 0, false, 6, null) + 1);
                AbstractC3255y.h(substring2, "this as java.lang.String).substring(startIndex)");
                String substring3 = substring2.substring(n.X(substring2, "/", 0, false, 6, null) + 1);
                AbstractC3255y.h(substring3, "this as java.lang.String).substring(startIndex)");
                if (substring3.length() > 0) {
                    String substring4 = substring2.substring(n.X(substring2, "/", 0, false, 6, null) + 1);
                    AbstractC3255y.h(substring4, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring4);
                } else {
                    String substring5 = substring2.substring(n.X(substring2, ":", 0, false, 6, null) + 1);
                    AbstractC3255y.h(substring5, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring5);
                }
            }
            textView.setTypeface(j.f3824g.u());
            LinearLayout linearLayout5 = this.f30520C;
            if (linearLayout5 == null) {
                AbstractC3255y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout5;
            }
            linearLayout2.addView(linearLayout4);
            O5.I i9 = O5.I.f8278a;
            V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.f30542Y = !this$0.f30542Y;
            RadioButton radioButton = this$0.f30528K;
            AbstractC3255y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: I4.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.t4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f30529L;
            AbstractC3255y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: I4.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.u4(view);
                }
            });
            RadioButton radioButton3 = this$0.f30530M;
            AbstractC3255y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: I4.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.v4(view);
                }
            });
        }
    }

    private final void t3() {
        File file = this.f30541X;
        AbstractC3255y.f(file);
        String absolutePath = file.getAbsolutePath();
        LinearLayout linearLayout = this.f30520C;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC3255y.y("llBreadcrumb");
            linearLayout = null;
        }
        if (linearLayout.findViewWithTag(absolutePath) == null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            int i8 = H4.f.f3729a;
            LinearLayout linearLayout3 = this.f30520C;
            if (linearLayout3 == null) {
                AbstractC3255y.y("llBreadcrumb");
                linearLayout3 = null;
            }
            View inflate = layoutInflater.inflate(i8, (ViewGroup) linearLayout3, false);
            AbstractC3255y.g(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout4 = (LinearLayout) inflate;
            linearLayout4.setTag(absolutePath);
            TextView textView = (TextView) linearLayout4.findViewById(e.f3709t0);
            File file2 = this.f30541X;
            AbstractC3255y.f(file2);
            String path = file2.getPath();
            AbstractC3255y.h(path, "currentDirFile!!.path");
            textView.setText(Uri.parse(path).getLastPathSegment());
            textView.setTypeface(j.f3824g.u());
            LinearLayout linearLayout5 = this.f30520C;
            if (linearLayout5 == null) {
                AbstractC3255y.y("llBreadcrumb");
            } else {
                linearLayout2 = linearLayout5;
            }
            linearLayout2.addView(linearLayout4);
            O5.I i9 = O5.I.f8278a;
            V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f30542Y = !this$0.f30542Y;
        this$0.O4();
        this$0.c5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u3(String str, String str2) {
        if (!isFinishing()) {
            RelativeLayout relativeLayout = this.f30555y;
            if (relativeLayout == null) {
                AbstractC3255y.y("rlLoading");
                relativeLayout = null;
            }
            relativeLayout.setVisibility(0);
            AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2695b(str, str2, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v3() {
        b bVar = this.f30534Q;
        AbstractC3255y.f(bVar);
        if (bVar.getItemCount() == 0) {
            DocumentFile documentFile = this.f30537T;
            if (documentFile != null) {
                AbstractC3255y.f(documentFile);
                e5(documentFile.canRead());
                return;
            }
            File file = this.f30541X;
            if (file != null) {
                AbstractC3255y.f(file);
                e5(file.canRead());
                return;
            }
            return;
        }
        LinearLayout linearLayout = this.f30518B;
        if (linearLayout == null) {
            AbstractC3255y.y("llEmptyDirectory");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v4(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3() {
        Uri n8 = new Q4.f().n(this);
        LinearLayout linearLayout = null;
        if (n8 != null) {
            this.f30537T = DocumentFile.fromTreeUri(this, n8);
            this.f30541X = null;
            p4(this, false, 1, null);
            return;
        }
        LinearLayout linearLayout2 = this.f30516A;
        if (linearLayout2 == null) {
            AbstractC3255y.y("llPermissionExplanation");
            linearLayout2 = null;
        }
        linearLayout2.setVisibility(0);
        RecyclerView recyclerView = this.f30553x;
        if (recyclerView == null) {
            AbstractC3255y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        LinearLayout linearLayout3 = this.f30516A;
        if (linearLayout3 == null) {
            AbstractC3255y.y("llPermissionExplanation");
        } else {
            linearLayout = linearLayout3;
        }
        View findViewById = linearLayout.findViewById(e.f3674h1);
        AbstractC3255y.h(findViewById, "llPermissionExplanation.…(R.id.tv_grant_access_sd)");
        TextView textView = (TextView) findViewById;
        textView.setTypeface(j.f3824g.u());
        textView.setOnClickListener(new View.OnClickListener() { // from class: I4.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.x3(FileExplorerActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w4(final FileExplorerActivity this$0, CompoundButton compoundButton, boolean z8) {
        AbstractC3255y.i(this$0, "this$0");
        if (z8) {
            this$0.f30542Y = !this$0.f30542Y;
            RadioButton radioButton = this$0.f30529L;
            AbstractC3255y.f(radioButton);
            radioButton.setOnClickListener(new View.OnClickListener() { // from class: I4.M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.x4(FileExplorerActivity.this, view);
                }
            });
            RadioButton radioButton2 = this$0.f30528K;
            AbstractC3255y.f(radioButton2);
            radioButton2.setOnClickListener(new View.OnClickListener() { // from class: I4.N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.y4(view);
                }
            });
            RadioButton radioButton3 = this$0.f30530M;
            AbstractC3255y.f(radioButton3);
            radioButton3.setOnClickListener(new View.OnClickListener() { // from class: I4.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.z4(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x4(FileExplorerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.f30542Y = !this$0.f30542Y;
        this$0.O4();
        this$0.d5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y3(SearchView searchView) {
        searchView.setOnQueryTextListener(null);
        searchView.setQuery("", false);
        searchView.setOnQueryTextListener(this.f30558z0);
        Object systemService = getSystemService("input_method");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(searchView.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y4(View view) {
    }

    private final InterfaceC3390x0 z3(ArrayList arrayList, DocumentFile documentFile, c cVar) {
        InterfaceC3390x0 d8;
        d8 = AbstractC3364k.d(l6.N.a(C3347b0.b()), null, null, new C2696c(arrayList, documentFile, cVar, this, null), 3, null);
        return d8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z4(View view) {
    }

    @Override // I4.a1
    public void Z0() {
        Object obj;
        super.Z0();
        O4.h l8 = j.f3824g.l();
        AbstractC3255y.f(l8);
        if (l8.e() != null && (obj = this.f30544p0) != null) {
            AbstractC3255y.f(obj);
            if (obj instanceof File) {
                File file = (File) obj;
                if (!file.isDirectory()) {
                    Application application = getApplication();
                    AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                    ((j) application).R(file);
                    return;
                }
                return;
            }
            if (obj instanceof DocumentFile) {
                Application application2 = getApplication();
                AbstractC3255y.g(application2, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                ((j) application2).Q((DocumentFile) obj);
            }
        }
    }

    @Override // I4.r
    public void b0() {
        I(getString(h.f3779a0));
    }

    @Override // I4.r
    public void c0() {
        Uri n8 = new Q4.f().n(this);
        if (n8 != null) {
            LinearLayout linearLayout = this.f30516A;
            if (linearLayout == null) {
                AbstractC3255y.y("llPermissionExplanation");
                linearLayout = null;
            }
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = this.f30553x;
            if (recyclerView == null) {
                AbstractC3255y.y("rvFiles");
                recyclerView = null;
            }
            recyclerView.setVisibility(0);
            this.f30537T = DocumentFile.fromTreeUri(this, n8);
            this.f30541X = null;
            p4(this, false, 1, null);
        }
    }

    @Override // I4.a1
    public void c1() {
    }

    @Override // I4.r
    public void d0() {
        I(getString(h.f3810q));
    }

    @Override // I4.r
    public void e0() {
        I(getString(h.f3779a0));
    }

    @Override // I4.r
    public void g0() {
        p4(this, false, 1, null);
        if (!T()) {
            p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(H4.f.f3746r);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey("subdir") && (string = extras.getString("subdir")) != null) {
                boolean z8 = extras.getBoolean("subdir_sd");
                this.f30543Z = z8;
                if (z8) {
                    Uri n8 = new Q4.f().n(this);
                    if (n8 != null) {
                        DocumentFile fromTreeUri = DocumentFile.fromTreeUri(this, n8);
                        if (fromTreeUri != null && string.length() > 0) {
                            Iterator it = n.s0(string, new String[]{"/"}, false, 0, 6, null).iterator();
                            while (it.hasNext() && (fromTreeUri = fromTreeUri.findFile((String) it.next())) != null) {
                            }
                        }
                        this.f30537T = fromTreeUri;
                        this.f30541X = null;
                    }
                } else {
                    this.f30541X = new File(string);
                    this.f30537T = null;
                }
            }
            if (extras.containsKey("select_path") && extras.getInt("select_path") == 1) {
                this.f30547s0 = true;
                View findViewById = findViewById(e.f3726z);
                AbstractC3255y.h(findViewById, "findViewById(R.id.ll_options)");
                View findViewById2 = findViewById(e.f3650Z1);
                AbstractC3255y.h(findViewById2, "findViewById(R.id.view_options_shadow)");
                ((LinearLayout) findViewById).setVisibility(0);
                findViewById2.setVisibility(0);
                TextView textView = (TextView) findViewById(e.f3614N1);
                this.f30524G = textView;
                if (textView != null) {
                    textView.setTypeface(j.f3824g.t());
                }
                TextView textView2 = this.f30524G;
                if (textView2 != null) {
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: I4.s
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            FileExplorerActivity.q4(FileExplorerActivity.this, view);
                        }
                    });
                }
                TextView textView3 = (TextView) findViewById(e.f3712u0);
                textView3.setTypeface(j.f3824g.t());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.f0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FileExplorerActivity.r4(FileExplorerActivity.this, view);
                    }
                });
            }
        }
        this.f30532O = (Toolbar) findViewById(e.f3685l0);
        TextView textView4 = (TextView) findViewById(e.f3638V1);
        this.f30533P = textView4;
        if (textView4 != null) {
            textView4.setText(getString(h.f3778a));
        }
        TextView textView5 = this.f30533P;
        if (textView5 != null) {
            textView5.setTypeface(j.f3824g.u());
        }
        Toolbar toolbar = this.f30532O;
        if (toolbar != null) {
            toolbar.setNavigationIcon(ContextCompat.getDrawable(this, H4.d.f3554b));
        }
        Toolbar toolbar2 = this.f30532O;
        if (toolbar2 != null) {
            toolbar2.setNavigationOnClickListener(new View.OnClickListener() { // from class: I4.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.F4(FileExplorerActivity.this, view);
                }
            });
        }
        Toolbar toolbar3 = this.f30532O;
        if (toolbar3 != null) {
            toolbar3.inflateMenu(H4.g.f3751a);
        }
        Toolbar toolbar4 = this.f30532O;
        if (toolbar4 != null) {
            toolbar4.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: I4.h0
                @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    boolean I42;
                    I42 = FileExplorerActivity.I4(FileExplorerActivity.this, menuItem);
                    return I42;
                }
            });
        }
        k4();
        View findViewById3 = findViewById(e.f3717w);
        AbstractC3255y.h(findViewById3, "findViewById(R.id.layout_breadcrumb_main)");
        this.f30520C = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(e.f3679j0);
        AbstractC3255y.h(findViewById4, "findViewById(R.id.sv_breadcumb)");
        this.f30521D = (HorizontalScrollView) findViewById4;
        LinearLayout linearLayout = this.f30520C;
        if (linearLayout == null) {
            AbstractC3255y.y("llBreadcrumb");
            linearLayout = null;
        }
        View findViewById5 = linearLayout.findViewById(e.f3719w1);
        AbstractC3255y.h(findViewById5, "llBreadcrumb.findViewById(R.id.tv_main_path)");
        TextView textView6 = (TextView) findViewById5;
        this.f30551w = textView6;
        if (textView6 == null) {
            AbstractC3255y.y("tvBreadCrumb");
            textView6 = null;
        }
        j.a aVar = j.f3824g;
        textView6.setTypeface(aVar.u());
        View findViewById6 = findViewById(e.f3662d1);
        AbstractC3255y.h(findViewById6, "findViewById(R.id.tv_empty_dir)");
        TextView textView7 = (TextView) findViewById6;
        this.f30522E = textView7;
        if (textView7 == null) {
            AbstractC3255y.y("tvEmptyDirectory");
            textView7 = null;
        }
        textView7.setTypeface(aVar.u());
        SearchView searchView = (SearchView) findViewById(e.f3664e0);
        this.f30525H = searchView;
        if (searchView != null) {
            searchView.setOnQueryTextListener(this.f30558z0);
        }
        SearchView searchView2 = this.f30525H;
        if (searchView2 != null) {
            searchView2.setOnClickListener(new View.OnClickListener() { // from class: I4.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileExplorerActivity.J4(FileExplorerActivity.this, view);
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(e.f3711u);
        this.f30526I = imageView;
        AbstractC3255y.f(imageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: I4.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.K4(FileExplorerActivity.this, view);
            }
        });
        this.f30527J = (RelativeLayout) findViewById(e.f3642X);
        RadioButton radioButton = (RadioButton) findViewById(e.f3609M);
        this.f30528K = radioButton;
        AbstractC3255y.f(radioButton);
        radioButton.setTypeface(aVar.u());
        RadioButton radioButton2 = this.f30528K;
        AbstractC3255y.f(radioButton2);
        radioButton2.setOnClickListener(new View.OnClickListener() { // from class: I4.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.L4(FileExplorerActivity.this, view);
            }
        });
        RadioButton radioButton3 = this.f30528K;
        AbstractC3255y.f(radioButton3);
        radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: I4.t
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.s4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        RadioButton radioButton4 = (RadioButton) findViewById(e.f3618P);
        this.f30529L = radioButton4;
        AbstractC3255y.f(radioButton4);
        radioButton4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: I4.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.w4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        RadioButton radioButton5 = (RadioButton) findViewById(e.f3600J);
        this.f30530M = radioButton5;
        AbstractC3255y.f(radioButton5);
        radioButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: I4.v
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.A4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        CheckBox checkBox = (CheckBox) findViewById(e.f3681k);
        checkBox.setTypeface(aVar.u());
        checkBox.setChecked(new J4.a(this).q());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: I4.D
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                FileExplorerActivity.E4(FileExplorerActivity.this, compoundButton, z9);
            }
        });
        c5();
        View findViewById7 = findViewById(e.f3658c0);
        AbstractC3255y.h(findViewById7, "findViewById(R.id.rv_files)");
        RecyclerView recyclerView = (RecyclerView) findViewById7;
        this.f30553x = recyclerView;
        if (recyclerView == null) {
            AbstractC3255y.y("rvFiles");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        RecyclerView recyclerView2 = this.f30553x;
        if (recyclerView2 == null) {
            AbstractC3255y.y("rvFiles");
            recyclerView2 = null;
        }
        recyclerView2.addItemDecoration(new s((int) getResources().getDimension(H4.c.f3552a)));
        RecyclerView recyclerView3 = this.f30553x;
        if (recyclerView3 == null) {
            AbstractC3255y.y("rvFiles");
            recyclerView3 = null;
        }
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        View findViewById8 = findViewById(e.f3639W);
        AbstractC3255y.h(findViewById8, "findViewById(R.id.rl_loading_file_explorer)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById8;
        this.f30555y = relativeLayout;
        if (relativeLayout == null) {
            AbstractC3255y.y("rlLoading");
            relativeLayout = null;
        }
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: I4.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.G4(view);
            }
        });
        View findViewById9 = findViewById(e.f3636V);
        AbstractC3255y.h(findViewById9, "findViewById(R.id.rl_loading_action)");
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById9;
        this.f30557z = relativeLayout2;
        if (relativeLayout2 == null) {
            AbstractC3255y.y("rlLoadingAction");
            relativeLayout2 = null;
        }
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: I4.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerActivity.H4(view);
            }
        });
        View findViewById10 = findViewById(e.f3720x);
        AbstractC3255y.h(findViewById10, "findViewById(R.id.ll_empty_dir)");
        this.f30518B = (LinearLayout) findViewById10;
        View findViewById11 = findViewById(e.f3573A);
        AbstractC3255y.h(findViewById11, "findViewById(R.id.ll_sd_permissions_explanation)");
        this.f30516A = (LinearLayout) findViewById11;
        TextView textView8 = (TextView) findViewById(e.f3629S1);
        this.f30549u0 = textView8;
        if (textView8 != null) {
            textView8.setTypeface(aVar.t());
        }
        TabLayout tabLayout = (TabLayout) findViewById(e.f3682k0);
        this.f30548t0 = tabLayout;
        AbstractC3255y.f(tabLayout);
        TabLayout.Tab text = tabLayout.newTab().setText(getString(h.f3772U));
        AbstractC3255y.h(text, "tabsStorage!!.newTab().s…string.internal_storage))");
        text.setId(0);
        TabLayout tabLayout2 = this.f30548t0;
        AbstractC3255y.f(tabLayout2);
        tabLayout2.addTab(text);
        TabLayout tabLayout3 = this.f30548t0;
        AbstractC3255y.f(tabLayout3);
        TabLayout.Tab text2 = tabLayout3.newTab().setText(getString(h.f3799k0));
        AbstractC3255y.h(text2, "tabsStorage!!.newTab().s…String(R.string.sd_card))");
        text2.setId(1);
        TabLayout tabLayout4 = this.f30548t0;
        AbstractC3255y.f(tabLayout4);
        tabLayout4.addTab(text2);
        TabLayout tabLayout5 = this.f30548t0;
        AbstractC3255y.f(tabLayout5);
        ViewGroupKt.get(tabLayout5, 0).setSelected(true);
        TabLayout tabLayout6 = this.f30548t0;
        AbstractC3255y.f(tabLayout6);
        tabLayout6.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new F());
        if (U()) {
            p4(this, false, 1, null);
            ArrayList c8 = new u().c(this);
            this.f30538U = c8;
            if (c8 != null && !c8.isEmpty()) {
                TabLayout tabLayout7 = this.f30548t0;
                if (tabLayout7 != null) {
                    tabLayout7.setVisibility(0);
                }
                TextView textView9 = this.f30549u0;
                if (textView9 != null) {
                    textView9.setVisibility(0);
                }
            } else {
                TabLayout tabLayout8 = this.f30548t0;
                if (tabLayout8 != null) {
                    tabLayout8.setVisibility(8);
                }
                TextView textView10 = this.f30549u0;
                if (textView10 != null) {
                    textView10.setVisibility(8);
                }
            }
        } else {
            K();
        }
        getOnBackPressedDispatcher().addCallback(this, this.f30517A0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent event) {
        AbstractC3255y.i(event, "event");
        if (i8 == 82) {
            Toolbar toolbar = this.f30532O;
            AbstractC3255y.f(toolbar);
            toolbar.showOverflowMenu();
            return true;
        }
        return super.onKeyDown(i8, event);
    }
}
