package gitworkflowdesign;

public class GitStepByStepGuide {
    public static void main(String[]Args){

        String step1 ="Execute git stash command in order to save the changes";
        String step2 ="Execute the command git checkout master";
        String step3="Sync with origin/master git fetch";
        String step4 ="Download the diff - git pull";
        String step5 = "Create new branch - git checkout -b 'NameBranch'";
        String step6 ="Make change, Commit them saves the changes on local memory stage- git commit";
        String step7 ="Upload the changes on the cloud -  git push";
        String step8 ="Go to GitHub and Create a new Pull request into the origin/master branch";
        String step9="Invite collaborators to review and approve the request";
        String step9a="If reviewers leave a comment that I need to make changes locally and execute git commit amend command";
        String step9b="After that execute git push -f";
        String step10="Merge the code";
        String step11="Deleted the created branch 'NameBranch' as it's merged";
        String step12 ="Go to the Intellij Idea and checkout the master branch";
        String step13="Download the latest version of origin/master";

        System.out.println(step1+step2+step3+step4+step5+step6+step7+step8+step9+step9a+step9b+step10+step11+step12+step13);

        ;
    }
}
