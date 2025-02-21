# Debricked Demo Repository

This is an intentionally vulnerable demo repository by [Debricked](https://debricked.com) that showcases common obstacles and risks related to open source dependencies. It demonstrates how our tool helps you analyze, detect, manage and remediate open source risks.

## Getting Started

### 1. Get a copy of the Repository

> [!NOTE]
>This repository comes with a pre-configured GitHub Actions workflow located at [.github/workflows/debricked.yml](.github/workflows/debricked.yml), but it is also possible to use your CI/CD tool of choice or download/clone the repository and scan it locally using the [Debricked CLI](https://github.com/debricked/cli/tree/main). For more information on integrating with other tools, visit [the documentation](https://docs.debricked.com/tools-and-integrations/integrations). 

The easiest way to get set up is to simply fork or import this repository to your own GitHub account, making use of the existing GitHub Actions workflow.

#### 1.1 (If forking the repository) Enable GitHub Actions in Forked Repositories

If you've forked this repository, please note that GitHub disables running workflows by default. To enable them:

1. Navigate to the **Actions** tab in your forked repository.
2. Click the button labeled **"I understand my workflows, go ahead and enable them"**.

This step is necessary for the workflows to run as expected.

### 2. Configure Your Debricked Access Token

To enable the dependency scans with GitHub actions, set up your Debricked Access Token as a GitHub secret:

1. Generate an Access Token through the Debricked UI (instructions can be found [here](https://docs.debricked.com/product/administration/generate-access-token))
2. Navigate to the repository on GitHub.
3. Go to **Settings** > **Secrets and variables** > **Actions**.
4. Click **New repository secret**.
5. Name the secret `DEBRICKED_API_KEY` and paste your Access Token as the value.

### 3. Run a scan

Once the API key is configured, the workflow will automatically scan your repository for dependency issues on:
* Every push to any branch.
* [Manually triggering the workflow](https://docs.github.com/en/actions/managing-workflow-runs-and-deployments/managing-workflow-runs/manually-running-a-workflow#running-a-workflow)

## Repository Structure

- **[.github/workflows/debricked.yml](.github/workflows/debricked.yml)**:  
  Contains the GitHub Actions workflow that triggers the Debricked dependency scan.
- **[README.md](README.md)**:  
  This documentation file.
- **[LICENSE](LICENSE)**:  
  The repository license.
- **[web/](web/)**:  
  Folder with code related to the frontend, using various vulnerable open source dependencies
- **[src/](src/)**:  
  Folder with code related to the backend, which is set up using a vulnerable version of the [Spring Framework](https://spring.io/projects/spring-framework).

## Additional Resources

- [Debricked Website](https://debricked.com)
- [Debricked Documentation](https://docs.debricked.com)
- [GitHub Actions Documentation](https://docs.github.com/en/actions)

## Contributing

Contributions to improve this demo are welcome! Please open an issue or submit a pull request with your suggestions.

## License

This repository is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.