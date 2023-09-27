package com.vimal.leetcodealgorithms.array

class numUniqueEmails {

    fun numUniqueEmails(emails: Array<String>): Int {
        val uniqueEmails = mutableSetOf<String>()

        for (email in emails) {
            val (local, domain) = email.split('@')
            val normalizedLocal = local.split('+')[0].replace(".", "")
            val normalizedEmail = "$normalizedLocal@$domain"
            uniqueEmails.add(normalizedEmail)
        }

        return uniqueEmails.size

    }
}