package com.getcapacitor.community.nativemarket;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.getcapacitor.a1;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import v0.b;

@b(name = "NativeMarket")
/* loaded from: classes.dex */
public class NativeMarket extends u0 {
    @a1
    public void openCollection(v0 v0Var) {
        try {
            if (v0Var.p("name")) {
                String n6 = v0Var.n("name");
                Context context = getContext();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/store/apps/collection/" + n6));
                intent.addFlags(268435456);
                context.startActivity(intent);
                v0Var.w();
            } else {
                v0Var.r("name is missing");
            }
        } catch (Exception e6) {
            v0Var.a(e6.getLocalizedMessage());
        }
    }

    @a1
    public void openDevPage(v0 v0Var) {
        try {
            if (v0Var.p("devId")) {
                String n6 = v0Var.n("devId");
                Context context = getContext();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/store/apps/dev?id=" + n6));
                intent.addFlags(268435456);
                context.startActivity(intent);
                v0Var.w();
            } else {
                v0Var.r("devId is missing");
            }
        } catch (Exception e6) {
            v0Var.a(e6.getLocalizedMessage());
        }
    }

    @a1
    public void openEditorChoicePage(v0 v0Var) {
        try {
            if (v0Var.p("editorChoice")) {
                String n6 = v0Var.n("editorChoice");
                Context context = getContext();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://play.google.com/store/apps/topic?id=" + n6));
                intent.addFlags(268435456);
                context.startActivity(intent);
                v0Var.w();
            } else {
                v0Var.r("editorChoice is missing");
            }
        } catch (Exception e6) {
            v0Var.a(e6.getLocalizedMessage());
        }
    }

    @a1
    public void openStoreListing(v0 v0Var) {
        try {
            if (v0Var.p("appId")) {
                String n6 = v0Var.n("appId");
                Context applicationContext = this.bridge.j().getApplicationContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + n6));
                intent.addFlags(268435456);
                applicationContext.startActivity(intent);
                v0Var.w();
            } else {
                v0Var.r("appId is missing");
            }
        } catch (Exception e6) {
            v0Var.a(e6.getLocalizedMessage());
        }
    }

    @a1
    public void search(v0 v0Var) {
        try {
            if (v0Var.p("terms")) {
                String n6 = v0Var.n("terms");
                Context context = getContext();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=" + n6));
                intent.addFlags(268435456);
                context.startActivity(intent);
                v0Var.w();
            } else {
                v0Var.r("terms is missing");
            }
        } catch (Exception e6) {
            v0Var.a(e6.getLocalizedMessage());
        }
    }
}
