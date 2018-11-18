/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.sepolicyinject;

public class SePolicyInject {

    static {
        System.loadLibrary("sepolicyinject");
    }

    private SePolicyInject() {}
}
