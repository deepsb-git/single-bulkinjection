# single-bulkinjection

## push fails to remote repo solution as below for info refer explanation.md

```
Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git status
On branch master
nothing to commit, working tree clean

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ ls -Force
ls: unknown option -- e
Try 'ls --help' for more information.

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git push origin master
Warning: Identity file /c/Users/deepak.barik/.ssh/id_ed25519 not accessible: No
such file or directory.
Enter passphrase for key '/c/Users/deepak.barik/.ssh/id_rsa':
To github.com:deepsb-git/single-bulkinjection.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'github.com:deepsb-git/single-bulkinjection.g
it'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git pull -rebase origin master
error: invalid value for '--rebase': 'ebase'

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git fetch origin
Warning: Identity file /c/Users/deepak.barik/.ssh/id_ed25519 not accessible: No
such file or directory.
Enter passphrase for key '/c/Users/deepak.barik/.ssh/id_rsa':
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (3/3), 876 bytes | 29.00 KiB/s, done.
From github.com:deepsb-git/single-bulkinjection
 * [new branch]      master     -> origin/master

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git rebase origin/master
Successfully rebased and updated refs/heads/master.

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git status
On branch master
nothing to commit, working tree clean

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git add .

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git rebase --continue
fatal: no rebase in progress

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git pull --rebase origin master
Warning: Identity file /c/Users/deepak.barik/.ssh/id_ed25519 not accessible: No
such file or directory.
Enter passphrase for key '/c/Users/deepak.barik/.ssh/id_rsa':
From github.com:deepsb-git/single-bulkinjection
 * branch            master     -> FETCH_HEAD
Current branch master is up to date.

Deepak.Barik@DIGI-GI-L0743 MINGW64 ~/Project/spring_boot/go_spring_poc/boot_annoconfig_proj5 (master)
$ git push origin master
Warning: Identity file /c/Users/deepak.barik/.ssh/id_ed25519 not accessible: No
such file or directory.
Enter passphrase for key '/c/Users/deepak.barik/.ssh/id_rsa':
Enumerating objects: 27, done.
Counting objects: 100% (27/27), done.
Delta compression using up to 8 threads
Compressing objects: 100% (19/19), done.
Writing objects: 100% (26/26), 9.42 KiB | 877.00 KiB/s, done.
Total 26 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), done.
To github.com:deepsb-git/single-bulkinjection.git
   59fb3a2..544b88d  master -> master
```
