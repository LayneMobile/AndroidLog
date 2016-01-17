/*
 * Copyright 2016 Layne Mobile, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.laynemobile.androidlog;

import java.util.Locale;

public final class AndroidLog {
    private static volatile Locale sLocale = Locale.US;
    private static volatile Logger sLogger = Logger.NONE;

    private AndroidLog() { throw new AssertionError("no instances"); }

    public static void setLogger(Logger logger) {
        sLogger = (logger == null)
                ? Logger.NONE
                : logger;
    }

    public static void setFormatLocale(Locale locale) {
        sLocale = (locale == null)
                ? Locale.US
                : locale;
    }

    public static void v(String tag, String msg) {
        sLogger.v(tag, msg);
    }

    public static void v(String tag, String format, Object... args) {
        sLogger.v(tag, String.format(sLocale, format, args));
    }

    public static void v(String tag, Throwable tr, String msg) {
        sLogger.v(tag, msg, tr);
    }

    public static void v(String tag, Throwable tr, String format, Object... args) {
        sLogger.v(tag, String.format(sLocale, format, args), tr);
    }

    public static void d(String tag, String msg) {
        sLogger.d(tag, msg);
    }

    public static void d(String tag, String format, Object... args) {
        sLogger.d(tag, String.format(sLocale, format, args));
    }

    public static void d(String tag, Throwable tr, String msg) {
        sLogger.d(tag, msg, tr);
    }

    public static void d(String tag, Throwable tr, String format, Object... args) {
        sLogger.d(tag, String.format(sLocale, format, args), tr);
    }

    public static void i(String tag, String msg) {
        sLogger.i(tag, msg);
    }

    public static void i(String tag, String format, Object... args) {
        sLogger.i(tag, String.format(sLocale, format, args));
    }

    public static void i(String tag, Throwable tr, String msg) {
        sLogger.i(tag, msg, tr);
    }

    public static void i(String tag, Throwable tr, String format, Object... args) {
        sLogger.i(tag, String.format(sLocale, format, args), tr);
    }

    public static void w(String tag, String msg) {
        sLogger.w(tag, msg);
    }

    public static void w(String tag, String format, Object... args) {
        sLogger.w(tag, String.format(sLocale, format, args));
    }

    public static void w(String tag, Throwable tr, String msg) {
        sLogger.w(tag, msg, tr);
    }

    public static void w(String tag, Throwable tr, String format, Object... args) {
        sLogger.w(tag, String.format(sLocale, format, args), tr);
    }

    public static void e(String tag, String msg) {
        sLogger.e(tag, msg);
    }

    public static void e(String tag, String format, Object... args) {
        sLogger.e(tag, String.format(sLocale, format, args));
    }

    public static void e(String tag, Throwable tr, String msg) {
        sLogger.e(tag, msg, tr);
    }

    public static void e(String tag, Throwable tr, String format, Object... args) {
        sLogger.e(tag, String.format(sLocale, format, args), tr);
    }
}
